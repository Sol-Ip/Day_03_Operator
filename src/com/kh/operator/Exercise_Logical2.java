package com.kh.operator;

import java.util.Scanner;

public class Exercise_Logical2 {

	
	// �Է��� ���� ���� �빮������ Ȯ���Ͽ� ��� ����ϱ�
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է� ���ּ��� : ");
		char num = sc.next().charAt(0);
		// �빮�� A to Z , �ҹ��� a to z
		boolean x = (num >= 'A' && num <='Z');
		System.out.println("�Է��� ���� ���� �빮���ΰ�? : " + x);
	}
}
