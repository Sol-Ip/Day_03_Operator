package com.kh.operator;

import java.util.Scanner;

public class Exam_Unary {
	
	public static void main(String [] args) {
		 //단항 연산자 실습 예제
		System.out.println("======= 단항 연산자 =======");
		System.out.println("===========예제1===========");
		Scanner sc = new Scanner (System.in);
		System.out.print("a의 값을 입력해주세요 : ");
		int a = sc.nextInt();
		System.out.print("b의 값을 입력해주세요 : ");
		int b = sc.nextInt();
		System.out.print("c의 값을 입력해주세요 : ");
		int c = sc.nextInt();
		
		a++;
		b = (--a) + b;
		c = (a++) + (--b);
		
		System.out.println("a의 값 : " + a);
		System.out.println("b의 값 : " + b);
		System.out.println("c의 값 : " + c);
		System.out.println("==========예제1 끝=========");
		
		System.out.println("===========예제2===========");
		boolean flag = true;
		System.out.println(!!!!flag);
		System.out.println("==========예제2 끝=========");
		
		System.out.println("===========예제3===========");
		int x = 100;
		int y = 33;
		int z = 0;
		
		x--;
		z = x-- + --y;
		x = 99 + x++ +x;
		y = y-- + y + ++y;
		
		System.out.println("x의 값 : " + x +  " , y의 값 : " + y + " , z의 값 : " + z);

		System.out.println("==========예제3 끝=========");
	}
}
