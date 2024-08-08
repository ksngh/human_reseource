package entity;

public class Member {

	public Member() {

	}

	public Member(String memberName, String deptName, String date, String status) {
		this.memberName = memberName;
		this.deptName = deptName;
		this.date = date;
		this.status = status;
	}

	String memberId;
	String memberName;
	String deptName;
	String date;
	String status;
}
