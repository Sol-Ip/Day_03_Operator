package com.kh.operator;

import java.util.Scanner;

public class Exercise_Logical1 {
	
	// 입력한 정수값이 1 ~ 100 사이의 숫자인지 확인하기
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력해주세요 : ");
		int num = sc.nextInt();
		// 1~100 사이의 숫자인지 확인 
		// 1 <= num <= 100
		// 논리연산자 AND 로 연산한 결과는 true or false;
		boolean isTrue = (num >= 1) && (num <= 100);
		//결과 출력
		System.out.println("1부터 100사이의 숫자인가? : " + isTrue);
	}
}
