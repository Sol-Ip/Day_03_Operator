package com.kh.operator;

import java.util.Scanner;

public class Exam_Calculator {

	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ������ �Է��ϼ��� : ");
		int a = sc.nextInt();
		// �ڷ��� ����1 = �Է¹޴� ��ɾ�
		
		System.out.print("�ι�° ������ �Է��ϼ��� : ");
		int b = sc.nextInt();
		// �ڷ��� ����2 = �Է¹޴� ��ɾ�

		System.out.println("���ϱ� ��� : " + (a+b) ); //����1 ������ ����2
		System.out.println("���� ��� : " + (a-b) );   //����1 ������ ����2
		System.out.println("������ ��� : " + (a/b )); //����1 ������ ����2
		System.out.println("������ ��� : " + (a%b) ); 
		System.out.println("���ϱ� ��� : "  + (a*b) );
		
	}
}
