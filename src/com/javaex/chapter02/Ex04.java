package com.javaex.chapter02;
import java.util.Scanner; // scanner 사용을 위한 외부 클래스 호출

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 객체생성
		
		// 이름 입력 받기
		System.out.println("이름을 입력해주세요.");
		System.out.print("이름 : ");
		String name = sc.next(); // 변수 생성과 동시에 값 입력
		
		// 나이 입력 받기
		System.out.println("나이를 입력해주세요.");
		System.out.print("나이 : ");
		int age = sc.nextInt(); // 변수 생성과 동시에 값 입력
		
		// 나이 입력 받기
		System.out.println("키를 입력해주세요.");
		System.out.print("키 : ");
		double height = sc.nextDouble(); // 변수 생성과 동시에 값 입력
		
		// 출력
		System.out.println("당신의 이름은 " + name + ", " + "나이는 " + age + "살, " + "키는 " + height + "입니다.");
	
		 // 스캐너 종료
		sc.close();
	}
}
