package com.javaex.chapter04;

public class Ex09 {

	public static void main(String[] args) {
		int i = 1;
		
		while(true) {
			if (i % 6 == 0 && i % 14 == 0) {
				break;
			}
			i++;
		}
		System.out.println(i);
	}
}
