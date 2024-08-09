package dto;

public class DeptMonthlyDTO {

	String dept;
	int absence;
	int attendanceRate;
	int attendance;
	int holiday;

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getAbsence() {
		return absence;
	}

	public void setAbsence(int absence) {
		this.absence = absence;
	}

	public int getAttendanceRate() {
		return attendanceRate;
	}

	public void setAttendanceRate(int attendanceRate) {
		this.attendanceRate = attendanceRate;
	}

	public int getAttendance() {
		return attendance;
	}

	public void setAttendance(int attendance) {
		this.attendance = attendance;
	}

	public int getHoliday() {
		return holiday;
	}

	public void setHoliday(int holiday) {
		this.holiday = holiday;
	}

	public DeptMonthlyDTO(String dept,int absence, int attendanceRate, int attendance, int holiday) {
		this.dept = dept;
		this.absence = absence;
		this.attendanceRate = attendanceRate;
		this.attendance = attendance;
		this.holiday = holiday;
	}
}
