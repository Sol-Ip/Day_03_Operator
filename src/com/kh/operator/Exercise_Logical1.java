package com.kh.operator;

import java.util.Scanner;

public class Exercise_Logical1 {
	
	// �Է��� �������� 1 ~ 100 ������ �������� Ȯ���ϱ�
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �ϳ� �Է����ּ��� : ");
		int num = sc.nextInt();
		// 1~100 ������ �������� Ȯ�� 
		// 1 <= num <= 100
		// �������� AND �� ������ ����� true or false;
		boolean isTrue = (num >= 1) && (num <= 100);
		//��� ���
		System.out.println("1���� 100������ �����ΰ�? : " + isTrue);
	}
}
