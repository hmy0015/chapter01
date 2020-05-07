package com.javaex.chapter03;
import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("과목을 선택하세요.");
		System.out.println("(1. 자바	2. C	3. C++	4. 파이썬");
		System.out.print("과목번호 : ");
		int code = sc.nextInt();
		sc.close();
		
		switch(code) {
			case 1:
				System.out.println("R101호");
				break;
			case 2:
				System.out.println("R102호");
				break;
			case 3:
				System.out.println("R103호");
				break;
			case 4:
				System.out.println("R104호");
				break;
			case 5:
				System.out.println("관리자에게 문의하세요.");
				break;
			}
	}

}
