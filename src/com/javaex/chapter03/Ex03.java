package com.javaex.chapter03;
import java.util.Scanner; // scanner 사용을 위한 외부 클래스 호출

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 객체생성
		
		System.out.println("숫자를 입력하세요.");	
		System.out.print("숫자 : ");
		int num = sc.nextInt(); // 변수 생성과 동시에 값 입력받기

		// 숫자가 0보다 크면 양수, 0보다 작으면 음수, 0일 때는 0 출력
		if (num > 0) {
			System.out.println("양수입니다.");
		}
		else if (num < 0) {
			System.out.println("음수입니다.");
		}
		else {
			System.out.println("0입니다.");
		}
		
		// 스캐너 종료
		sc.close();
	}

}
