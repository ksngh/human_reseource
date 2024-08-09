package entity;

public class Member {

	public Member() {

	}

	public Member(String memberId, String memberName, String deptName) {
		this.memberId = memberId;
		this.memberName = memberName;
		this.deptName = deptName;
	}

	String memberId;
	String memberName;
	String deptName;
}
