package com.javaex.chapter02;
import java.util.Scanner; // scanner 사용을 위한 외부 클래스 호출

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 객체생성
		
		// 이름과 나이를 입력받을 변수 생성
		String name;
		int age;
		
		// 이름 입력 받기
		System.out.println("이름을 입력해주세요.");
		System.out.print("이름 : ");
		name = sc.next();
		
		// 나이 입력 받기
		System.out.println("나이를 입력해주세요.");
		System.out.print("나이 : ");
		age = sc.nextInt();
		
		// 이름과 나이 출력
		System.out.println("당신의 이름은 " + name + ", " + "나이는 " + age + "살 입니다.");
		
		// 스캐너 종료
		sc.close();
	}

}
