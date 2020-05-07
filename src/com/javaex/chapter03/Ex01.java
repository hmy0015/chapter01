package com.javaex.chapter03;
import java.util.Scanner; // scanner 사용을 위한 외부 클래스 호출

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 객체생성
		
		System.out.print("점수 : ");
		int score = sc.nextInt(); // 변수 생성과 동시에 값 입력
		
		// 점수가 60점 이상이면 "합격입니다." 출력
		if (score >= 60) {
			System.out.println("합격입니다.");
		}
		
		// 스캐너 종료
		sc.close();		
	}

}
