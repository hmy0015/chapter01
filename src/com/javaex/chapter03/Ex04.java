package com.javaex.chapter03;
import java.util.Scanner; // scanner 사용을 위한 외부 클래스 호출

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 객체생성

		int time, wage;
			
		System.out.print("근무시간 : ");
		time = sc.nextInt();
		sc.close(); // 스캐너 종료

		// 8시간 근무까지 임금 10000, 8시간 초과 시 시간당 임금 12000
		if (time > 8) {
			wage = 8 * 10000 + (time - 8) * 12000;
		}
		else {
			wage = time * 10000;
		}
		
		// 임금 출력
		System.out.println("임금은 " + wage + "원입니다.");
		
	}

}
