package com.kh.operator;

import java.util.Scanner;

public class Exam_Calculator {

	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수를 입력하세요 : ");
		int a = sc.nextInt();
		// 자료형 변수1 = 입력받는 명령어
		
		System.out.print("두번째 정수를 입력하세요 : ");
		int b = sc.nextInt();
		// 자료형 변수2 = 입력받는 명령어

		System.out.println("더하기 결과 : " + (a+b) ); //변수1 연산자 변수2
		System.out.println("빼기 결과 : " + (a-b) );   //변수1 연산자 변수2
		System.out.println("나누기 결과 : " + (a/b )); //변수1 연산자 변수2
		System.out.println("나머지 결과 : " + (a%b) ); 
		System.out.println("곱하기 결과 : "  + (a*b) );
		
	}
}
