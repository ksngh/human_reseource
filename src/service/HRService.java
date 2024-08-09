package service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import dto.DeleteDTO;
import dto.UpdateDTO;
import entity.Member;

public interface HRService {



	//id로 멤버 찾기
	Member findMemberById(String id);

	//HR 업데이트
	void updateHR(UpdateDTO updateDTO);

	//HR 지우기
	void deleteHR(DeleteDTO deleteDTO);

	// //부서명으로 월 별 근태 현황 찾기
	// void printHRByDept(String dept);

	//숫자 입력시 해당 서비스로 이동
	int chooseService(int userNum);

	//출근율 계산
	int calculateAttendanceRate(int attendance);

	//결석 계산
	int calculateAbsence(int attendance);

	//멤버 별 월간 출석 맵 반환
	Map<String,String> findMonthlyAttendanceByMemberName(Member member);

	void run() throws IOException;
}
