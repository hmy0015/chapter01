package com.javaex.chapter01;

public class Ex10 {

	public static void main(String[] args) {
		// 논리연산자		
		// 논리연산자 && (and)
		System.out.println("&&연산자");
		System.out.println(true&&true);
		System.out.println(true&&false);
		System.out.println(false&&true);
		System.out.println(false&&false);

		// 논리연산자 || (or)
		System.out.println("||연산자");
		System.out.println(true||true);
		System.out.println(true||false);
		System.out.println(false||true);
		System.out.println(false||false);
		
		// 논리연산자 ! (not)
		System.out.println("!연산자");
		System.out.println(!true);
		System.out.println(!false);
		
		// 응용
		int a = 5;
		int b = 7;
		
		System.out.println((a>b)&&(a<b)); // f&&t --> f

		System.out.println((a>b)||(a<b)); // f||t --> t
		
		System.out.println(!(a>b)); // !f --> t
	}

}
