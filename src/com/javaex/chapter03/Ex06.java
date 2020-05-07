package com.javaex.chapter03;
import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 객체생성
		int num;
		
		System.out.println("숫자를 입력하세요.");
		num = sc.nextInt();
		sc.close();
		
		if (num % 3 == 0) {
			System.out.println(num + "은(는) 3의 배수입니다.");
		}
		else {
			System.out.println(num + "은(는) 3의 배수가 아닙니다.");
		}
	}

}
