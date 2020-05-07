package com.javaex.chapter03;
import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int score;
		String grade;
		
		System.out.print("점수를 입력하세요 : ");
		score = sc.nextInt();
		sc.close();
		
		if (score <= 100 && score >= 90) {
			grade = "A등급";
		}
		else if (score < 90 && score >= 80) {
			grade = "B등급";
		}
		else if (score < 80 && score >= 70) {
			grade = "C등급";
		}
		else if (score < 70 && score >= 60) {
			grade = "D등급";
		}
		else if (score < 60 && score >= 0) {
			grade = "F등급";
		}
		else {
			grade = "0에서 100 사이의 값을 입력하십시오.";
		}
		
		System.out.println(grade);
	}
}
