package com.kh.operator;

import java.util.Scanner;

public class Exam_Unary {
	
	public static void main(String [] args) {
		 //���� ������ �ǽ� ����
		System.out.println("======= ���� ������ =======");
		System.out.println("===========����1===========");
		Scanner sc = new Scanner (System.in);
		System.out.print("a�� ���� �Է����ּ��� : ");
		int a = sc.nextInt();
		System.out.print("b�� ���� �Է����ּ��� : ");
		int b = sc.nextInt();
		System.out.print("c�� ���� �Է����ּ��� : ");
		int c = sc.nextInt();
		
		a++;
		b = (--a) + b;
		c = (a++) + (--b);
		
		System.out.println("a�� �� : " + a);
		System.out.println("b�� �� : " + b);
		System.out.println("c�� �� : " + c);
		System.out.println("==========����1 ��=========");
		
		System.out.println("===========����2===========");
		boolean flag = true;
		System.out.println(!!!!flag);
		System.out.println("==========����2 ��=========");
		
		System.out.println("===========����3===========");
		int x = 100;
		int y = 33;
		int z = 0;
		
		x--;
		z = x-- + --y;
		x = 99 + x++ +x;
		y = y-- + y + ++y;
		
		System.out.println("x�� �� : " + x +  " , y�� �� : " + y + " , z�� �� : " + z);

		System.out.println("==========����3 ��=========");
	}
}
