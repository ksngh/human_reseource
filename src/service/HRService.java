package service;

import entity.Member;

public interface HRService {

	//id로 멤버 찾기
	Member findMemberById(int id);

	//HR 업데이트
	void updateHR();

	//HR 지우기
	void deleteHR();

	//부서명으로 월 별 근태 현황 찾기
	void printHRByDept(String dept);

	//숫자 입력시 해당 서비스로 이동
	int chooseService(int userNum);

	//출근율 계산
	long calculateAttendanceRate(int attendance);

	//결석 계산
	int calculateAbsence(int attendance);
}
