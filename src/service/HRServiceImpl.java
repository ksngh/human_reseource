package service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import dto.DeleteDTO;
import dto.UpdateDTO;
import entity.Member;
import util.DBConnection;
import util.InputOutput;

public class HRServiceImpl implements HRService {

	private DBConnection dbConnection;
	private final InputOutput inputOutput;

	public HRServiceImpl(DBConnection dbConnection, InputOutput inputOutput) {
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

}
