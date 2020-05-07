package com.javaex.chapter01;

public class Ex06 {

	public static void main(String[] args) {
		// 자동 형변환1		정수 + 실수
		float result = 2+3.5f;
		System.out.println(result);
		
		// 자동 형변환2 	long형 + float형 ==> float형
		long var02 = 12345L;
		float var03 = 1.1f;
		float result01 = var02 + var03;
		System.out.println(result01);
		
		////////////////////////////////////////////////
		// 강제 형변환
		int i = (int)1112.532424;
		System.out.println(i);
		
		// 확대변환
		byte v01 = 10;
		int v02 = (int)v01; // 강제형변환 byte ==> int
		System.out.println(v02);
		
		// 축소변환 (정상적인 경우)
		int v03 = 10;
		byte v04 = (byte)v03;
		System.out.println(v04);
		
		//축소변환 (비정상적인 경우)
		int v05 = 710302977;
		byte v06 = (byte)v05;
		System.out.println(v06);
		
		//실수 --> 정수
		double v07 = 5.57;
		int v08 = (int)v07;
		System.out.println(v08); // 소수점 생략
		
		//정수 --> 실수
		int v09 = 7;
		double v10 = (double)v09;
		System.out.println(v10);
	}

}
