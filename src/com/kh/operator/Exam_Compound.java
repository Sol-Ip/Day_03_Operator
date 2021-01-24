package com.kh.operator;

public class Exam_Compound {

	public static void main(String [] args) {
		//세 개의 정수를 입력받아 아래의 연산을 하면 결과가 어떻게 될지 출력하기
		int a = 10;
		int b = 20;
		int c = 30;
		
		System.out.println(a+=20);
		System.out.println(b*=3);
		System.out.println(c/=4);
		System.out.println(a%=b);
		System.out.println(c-=a);
		
	}
}
