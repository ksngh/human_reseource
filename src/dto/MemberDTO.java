package dto;

public class MemberDTO {
	int id;
	String memberName;
	String deptName;
	String date;
	String status;

	public MemberDTO(String memberName, String date, String status) {
		this.memberName = memberName;
		this.date = date;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public String getUserName() {
		return memberName;
	}

	public String getDeptName() {
		return deptName;
	}

	public String getDate() {
		return date;
	}

	public String getStatus() {
		return status;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setUserName(String memberName) {
		this.memberName = memberName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
