package com.javaex.chapter03;
import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int code;
		String classroom;
		
		System.out.println("과목을 선택하세요.");
		System.out.println("(1. 자바	2. C	3. C++	4. 파이썬");
		System.out.print("과목번호 : ");
		code = sc.nextInt();
		sc.close();
		
		if (code == 1) {
			classroom = "R101호";
		}
		else if (code == 2) {
			classroom = "R102호";
		}
		else if (code == 3) {
			classroom = "R103호";
		}
		else if (code == 4) {
			classroom = "R104호";
		}
		else {
			classroom = "관리자에게 문의하세요.";
		}

		System.out.println(classroom);
	}
}
