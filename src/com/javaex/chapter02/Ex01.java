package com.javaex.chapter02;
import java.util.Scanner; // scanner 사용을 위한 외부 클래스 호출

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 객체생성
		int num = sc.nextInt(); // 정수형 변수 num에 값 입력
		System.out.println(num); // 변수 num 출력
		sc.close(); // scanner 종료
		
		// next() => 공백 이전까지의 문자열을 입력받음(단어 입력 시 사용하면 좋음)
		// 정수, 실수 등을 입력받는 것은 next + 자료형()
		// ex) nextInt(), nextDouble() 등
		// 문자열 전체를 입력받는 것은 nextLine() => 공백이 포함 될 여지가 있다면 nextLine()을 사용하는 것이 좋음
	}

}
