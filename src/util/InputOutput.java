package util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import dto.DeleteDTO;
import dto.DeptMonthlyDTO;
import dto.UpdateDTO;

public class InputOutput {


	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	//인적 자원 관리 시스템 출력 및 유저 입력
	public int HRSystem() throws IOException {

		bw.write("==== 인적 자원 관리 시스템 ====\r\n");
		bw.write("1. 조직/직무 관리\r\n");
		bw.write("2. 인사행정\r\n");
		bw.write("3. 근태 관리 *\r\n");
		bw.write("4. 급여/정산\r\n");
		bw.write("5. 사회보험\r\n");
		bw.write("6. 평가 관리\r\n");
		bw.write("7. 연말정산\r\n");
		bw.write("8. 승진 관리\r\n");
		bw.write("9. 핵심 인재 관리\r\n");
		bw.write("10. 월별 종합 현황 보기\r\n");
		bw.write("0. 종료 *\r\n");
		bw.write("\r\n선택하세요 :\r\n");
		bw.flush();

		return Integer.parseInt(br.readLine());

	};

	//근태 관리 출력 및 유저 입력
	public int manageHR() throws IOException {

		bw.write("==== 근태 관리 ====\r\n");
		bw.write("1. 근태 입력 (option)\r\n");
		bw.write("2. 근태 수정 *\r\n");
		bw.write("3. 근태 삭제 *\r\n");
		bw.write("4. 직원별 월별 근태 현황 보기 (option)\r\n");
		bw.write("5. 부서별 월별 근태 현황 보기 *\r\n");
		bw.write("0. 메인 메뉴로 돌아가기 *\r\n");
		bw.write("\r\n선택하세요 :\r\n");
		bw.flush();



		return Integer.parseInt(br.readLine());

	}

	public UpdateDTO updateInfo() throws IOException {

		UpdateDTO updateDTO = new UpdateDTO();

		bw.write("==== 근태 수정 ====\r\n");
		bw.write("직원 ID 입력 : " +"\r\n");
		bw.flush();
		updateDTO.setMemberId(br.readLine());

		bw.write("날짜 입력 (YYYY-MM-DD):"+"\r\n");
		bw.flush();
		updateDTO.setDate(br.readLine());

		bw.write("근무 상태 입력 (출근/결근/휴가 등):\r\n");
		bw.flush();
		updateDTO.setStatus(br.readLine());

		bw.write("수정되었습니다\r\n");
		bw.flush();

		return updateDTO;
	}

	public DeleteDTO deleteInfo() throws IOException {

		DeleteDTO deleteDTO = new DeleteDTO();

		bw.write("==== 근태 삭제 ====\r\n");
		bw.write("직원 ID 입력 : " +"\r\n");
		bw.flush();
		deleteDTO.setMemberId(br.readLine());

		bw.write("날짜 입력 (YYYY-MM-DD):"+"\r\n");
		bw.flush();
		deleteDTO.setDate(br.readLine());

		return deleteDTO;
	}
	public DeptMonthlyDTO getDeptMonthlyDTO() throws IOException {

		bw.write("==== 부서별 월별 근태 현황 ====\r\n");
		bw.write("부서: \r\n");
		bw.flush();
		String dept = br.readLine();
		return new DeptMonthlyDTO(dept);

	}
	public void printDeptMonthlyHR(DeptMonthlyDTO deptMonthlyDTO) throws IOException {

		bw.write("직원 ID : "+deptMonthlyDTO.getMemberId()+"\r\n");
		bw.write("이름 : " +deptMonthlyDTO.getName()+"\r\n");
		bw.write("출근율 : " +deptMonthlyDTO.getAttendanceRate()+"%\r\n");
		bw.flush();
		bw.write("출근 : " + deptMonthlyDTO.getAttendance() +
				", 결근 : " + deptMonthlyDTO.getAbsence() +
				", 휴가 : " + deptMonthlyDTO.getHoliday() + "\r\n");
		bw.flush();

	}
}
