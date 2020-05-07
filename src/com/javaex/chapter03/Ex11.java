package com.javaex.chapter03;
import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month, days;
		
		System.out.println("월을 입력하세요.");
		month = sc.nextInt();
		sc.close();

		switch (month) {
		    case 2: 
		        days = 28; 	
		        break; 
		        
		    case 4: 
		    case 6: 
		    case 9: 
		    case 11: 
		        days = 30;	
		        break; 
	
		    default: 
		        days = 31; 
		        break;
		 } 

		System.out.println(days + "일 입니다.");
	}
}
