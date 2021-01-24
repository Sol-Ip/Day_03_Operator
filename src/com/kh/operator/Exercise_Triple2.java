package com.kh.operator;

import java.util.Scanner;

public class Exercise_Triple2 {
	//삼항 연산자 중첩 사용
	//두 수와 '+' 또는 '-'를 입력받아 알맞은 계산 결과 출력하기
	//단, '+', '-' 이외의 연산자 입력시 "잘못 입력하셨습니다!" 출력하기
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수 : ");
		int x = sc.nextInt();
		System.out.print("두번째 수 : ");
		int y = sc.nextInt();
		System.out.print("연산자 입력(+ or -) : ");
		char op = sc.next().charAt(0);
		//삼항 연산자 중첩 사용
		int result1 = (op == '+') ? x+y : x-y;
		String result = (op == '+') ? x+y+"" : ((op == '-') ? x-y + "" : "잘못입력하셨습니다!");

		System.out.println("결과 : " + result);
		
				
	}
}
