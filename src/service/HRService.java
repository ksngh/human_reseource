package service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

import dto.DeleteDTO;
import dto.DeptMonthlyDTO;
import dto.UpdateDTO;
import entity.Member;

public interface HRService {

	Member findMemberById(String id);

	//HR 업데이트
	void updateHR(UpdateDTO updateDTO);

	//HR 지우기
	void deleteHR(DeleteDTO deleteDTO);

	//출근율 계산
	int calculateAttendanceRate(int attendance);

	//멤버 별 월간 출석 맵 반환
	ArrayList<DeptMonthlyDTO> findMonthlyAttendanceByMemberName(String dept);

	// 실행 메소드
	void run() throws IOException;
}
