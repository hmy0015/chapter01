package com.javaex.chapter01;

public class Ex07 {

	public static void main(String[] args) {
		// 정수 / 정수
		double v01 = 5/4;
        System.out.println(v01);     

        // 실수 / 정수
        double v02 = (double)5 / 4 ; // 5.0 / 4 --> 5.0 / 4.0
        System.out.println(v02);   

        // 정수 / 실수
        double v03 = 5 / (double)4 ;  // 5 / 4.0 --> 5.0 / 4.0 
        System.out.println(v03);     

        // 실수 / 실수
        double v04 = (double)5 / (double)4 ;  // 5.0 / 4.0
        System.out.println(v04);    

        // 실수 + 실수 (정수로 강제형변환)
        int v05 = (int)1.3 + (int)1.8 ;  
        System.out.println(v05);    

	}

}
