package com.javaex.chapter04;
import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, sum = 0;
	
		System.out.println("숫자를 입력하세요(0이면 종료)");
		
		do {
			System.out.print("숫자 : ");
			i = sc.nextInt();
			sum += i;
			System.out.println("합계 : " + sum + "\n");
		}
		while(i > 0);
		
		System.out.println("~ 종료 ~");
		sc.close();
	}

}
