package dto;

public class MemberDTO {
	String userName;
	String deptName;
	String date;
	String status;

	public MemberDTO(String userName, String date, String status) {
		this.userName = userName;
		this.date = date;
		this.status = status;
	}

	public String getUserName() {
		return userName;
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

	public void setUserName(String userName) {
		this.userName = userName;
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
