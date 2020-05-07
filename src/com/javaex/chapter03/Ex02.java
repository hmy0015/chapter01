package com.javaex.chapter03;
import java.util.Scanner; // scanner 사용을 위한 외부 클래스 호출

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 객체생성
		
		System.out.print("점수 : ");
		int score = sc.nextInt();
		
		// 점수가 60점 이상이면 합격, 60점 미만이면 불합격
		if (score >= 60) {
			System.out.println("합격입니다.");
		}
		else {
			System.out.println("불합격입니다.");
		}
		
		sc.close();
	}
}
