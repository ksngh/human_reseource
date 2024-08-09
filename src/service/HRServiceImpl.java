package service;

import static java.lang.Math.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import dto.DeptMonthlyDTO;
import dto.UpdateDTO;
import entity.Member;
import util.DBConnection;
import util.InputOutput;

public class HRServiceImpl implements HRService {

	private DBConnection dbConnection;
	private InputOutput inputOutput;

	ArrayList<Integer> pageList;


	public HRServiceImpl(InputOutput inputOutput, DBConnection dbConnection) {
		this.inputOutput = inputOutput;
		this.dbConnection = dbConnection;
	}

	@Override
	public Member findMemberById(int id) {
		return null;
	}

	@Override
	public void updateHR(UpdateDTO updateDTO) {

	}

	@Override
	public void deleteHR() {

	}

	// @Override
	// public void printHRByDept(String dept) {
	//
	// }

	@Override
	public ArrayList<Integer> chooseService(int num){
		//미구현
		return null;
	}

	@Override
	public int calculateAttendanceRate(int attendance) {
		return round(((float)attendance /22)*100);
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
