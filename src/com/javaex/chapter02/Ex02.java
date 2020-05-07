package com.javaex.chapter02;
import java.util.Scanner; // scanner 사용을 위한 외부 클래스 호출

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 객체생성
		
		String name;
		System.out.println("이름을 입력해주세요."); // pintln => 자동으로 줄바꿈
		System.out.print("이름 : "); // print => 줄바꿈 없음
		name = sc.next();
		System.out.println("당신의 이름은 " + name + "입니다.");

		// 스캐너 종료
		sc.close();
	}

}
