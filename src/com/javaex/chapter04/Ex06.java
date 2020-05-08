package com.javaex.chapter04;

public class Ex06 {

	public static void main(String[] args) {
		int mul = 0;

		for (int dan = 2; dan < 10; dan++) {
			for (int i = 1; i < 10; i++) {
				mul = dan * i;
				System.out.println(dan + " * " + i + " = " + mul);
			}
			System.out.println("===========");
		}

	}

}
