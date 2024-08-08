package service;

import java.util.ArrayList;
import java.util.Map;

import entity.Member;
import util.DBConnection;

public class HRServiceImpl implements HRService {

	DBConnection dbConnection = new DBConnection();

	public HRServiceImpl(DBConnection dbConnection) {
		this.dbConnection = dbConnection;
	}

	ArrayList<Integer> pageList = new ArrayList<>();

	@Override
	public Member findMemberById(int id) {
		return null;
	}

	@Override
	public void updateHR() {

	}

	@Override
	public void deleteHR() {

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
