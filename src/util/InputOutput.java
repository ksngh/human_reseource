package util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class InputOutput {

	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	//인적 자원 관리 시스템 출력 및 유저 입력
	public int HRSystem() throws IOException {
		bw.write("==== 인적 자원 관리 시스템 ====\r\n");
		return 3;
	};

	//근태 관리 출력 및 유저 입력
	public int manageHR(){
		return 3;
	}

	//월별 근태 현황 출력 및 유저 입력
	public int monthlyHR(){
		return 0;
	}
}
