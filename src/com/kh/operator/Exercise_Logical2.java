package com.kh.operator;

import java.util.Scanner;

public class Exercise_Logical2 {

	
	// 입력한 문자 값이 대문자인지 확인하여 결과 출력하기
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자를 입력 해주세요 : ");
		char num = sc.next().charAt(0);
		// 대문자 A to Z , 소문자 a to z
		boolean x = (num >= 'A' && num <='Z');
		System.out.println("입력한 문자 값은 대문자인가? : " + x);
	}
}
