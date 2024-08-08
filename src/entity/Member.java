package entity;

public class Member {

	public Member() {

	}

	public Member(String userName, String deptName, String date, String status) {
		this.userName = userName;
		this.deptName = deptName;
		this.date = date;
		this.status = status;
	}

	String userName;
	String deptName;
	String date;
	String status;
}
