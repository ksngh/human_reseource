package service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import entity.Member;
import util.DBConnection;

public class HRServiceImpl implements HRService {

	DBConnection dbConnection;

	public HRServiceImpl(DBConnection dbConnection) {
		this.dbConnection = dbConnection;
	}

	ArrayList<Integer> pageList = new ArrayList<>();

	@Override
	public Member findMemberById(String id) {
		String sql = "SELECT * FROM EMPLOYEE where EMPLOYEE_PK_ID = " + id;
		String name = "";
		try {
			ResultSet rs = dbConnection.getStmt().executeQuery(sql);
			while (rs.next()) {
				name = rs.getString("MEMBER");
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		System.out.println(name);
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
