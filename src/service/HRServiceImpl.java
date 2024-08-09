package service;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import dto.DeleteDTO;
import dto.UpdateDTO;
import dto.DeptMonthlyDTO;
import dto.UpdateDTO;
import entity.Member;
import util.DBConnection;
import util.InputOutput;

public class HRServiceImpl implements HRService {

	private DBConnection dbConnection;
	private final InputOutput inputOutput;

	ArrayList<Integer> pageList;

	public HRServiceImpl(InputOutput inputOutput, DBConnection dbConnection) {
		this.inputOutput = inputOutput;
		this.dbConnection = dbConnection;
	}

	ArrayList<Integer> pageList = new ArrayList<>();

    @Override
    public Member findMemberById(String id) {
        String sql = "select e.EMPLOYEE_PK_ID, e.`MEMBER` as memberName, d.DEPT_NAME as deptName  " +
                "from employee e join dept d on e.DEPT_FK_ID = d.DEPT_PK_ID where e.EMPLOYEE_PK_ID = '"+id+"'";
        String memberName = "";
        String deptName = "";
        String memberID = "";
        try {
            ResultSet rs = dbConnection.getStmt().executeQuery(sql);
            while (rs.next()) {
                memberName = rs.getString("memberName");
                deptName = rs.getString("deptName");
                memberID = rs.getString("EMPLOYEE_PK_ID");
            }
//			dbConnection.getConn().commit();
            rs.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return new Member(memberID, memberName, deptName);
    }

    @Override
    public void updateHR(UpdateDTO updateDTO) {
        String sql01 = "select WORK_STAT_PK_ID as workID from work_status where `STATUS` = '"+updateDTO.getStatus()+"'";
        String workId = "";

        try {
            ResultSet rs01 = dbConnection.getStmt().executeQuery(sql01);
            while (rs01.next()) {
                workId = rs01.getString("workID");
            }
            String sql02 = "update employee_attendance \n" +
                    "set WORK_STAT_FK_ID = '" + workId + "'\n" +
                    "where\tEMPLOYEE_FK_ID = '"+updateDTO.getMemeberId()+"' and `DATE` = '"+updateDTO.getDate()+"'";
            int rs02 = dbConnection.getStmt().executeUpdate(sql02);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public void deleteHR(DeleteDTO deleteDTO) {
        String sql = "delete from employee_attendance\n" +
                "where EMPLOYEE_FK_ID = '"+deleteDTO.getMemeberId()+"' and `DATE` = '"+deleteDTO.getDate()+"'";
        try {
            int rs = dbConnection.getStmt().executeUpdate(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

	// @Override
	// public void printHRByDept(String dept) {
	//
	// }

	@Override
	public int chooseService(int num) {
		return 0;
	}

	@Override
	public long calculateAttendanceRate(int attendance) {
		return 0;
	}

	@Override
	public int calculateAbsence(int attendance) {
		return 22-attendance;
	}

	@Override
	public Map<String, String> findMonthlyAttendanceByMemberName(Member member) {
		return null;
	}

	@Override
	public void run() throws IOException {

		pageList = new ArrayList<>();
		pageList.add(1);

		while (true) {

			if (pageList.isEmpty()){
				break;
			} else if(pageList.size()==1){

				int userNum01 = inputOutput.HRSystem();

				switch (userNum01){
					case 3:
						pageList.add(userNum01);
						break;
					case 0 :
						pageList.removeLast();
						break;
				}
			} else{

				int userNum02 = inputOutput.manageHR();

				switch (userNum02){
					case 2:
						//근태 수정
						UpdateDTO updateDTO = inputOutput.getInfoHR();
						updateHR(updateDTO);
						break;
					case 3:
						//근태 삭제

						break;
					case 5:
						//부서별 월별 근태 현황 보기
						DeptMonthlyDTO deptMonthlyDTO = new DeptMonthlyDTO();

						break;
					case 0:
						//메인 메뉴로 돌아가기
						pageList.removeLast();
						break;
				}
			}
		}
	}

}
