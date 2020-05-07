package com.javaex.chapter03;
import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("숫자를 입력하세요.");
		System.out.print("숫자 : ");
		num = sc.nextInt();
		sc.close();
		
		if (num > 0) {
			if(num % 2 == 0) {
				System.out.println("짝수");
			}
			else {
				System.out.println("홀수");
			}
		}
		else if (num < 0) {
			System.out.println("음수");
		}
		else {
			System.out.println("0");
		}
	}
}
