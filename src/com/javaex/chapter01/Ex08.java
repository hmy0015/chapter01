package com.javaex.chapter01;

public class Ex08 {

	public static void main(String[] args) {
		// 대입연산자
		int a = 7;
		int b = 2;
				
		// 산술연산자
		System.out.println("산술연산자");
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		
		System.out.println(a/b);
		System.out.println(a%b);
		
		// 부호연산자
		System.out.println("부호연산자");
		int var = -3;
		int pVar = +var;
		int mVar = -var;

		System.out.println(pVar);
		System.out.println(mVar);
		
		// 증감연산자
		System.out.println("증감연산자");
		System.out.println(a); // a = 7
		System.out.println(++a); // a = 8
		System.out.println(b); // b = 2
		System.out.println(--b); // b = 1
		System.out.println(a++); // a = 8, a --> 9
		System.out.println(a); // a = 9
	}
}
