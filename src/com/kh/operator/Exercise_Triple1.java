package com.kh.operator;

import java.util.Scanner;

public class Exercise_Triple1 {
	//���� ������ ��ø ���
	//�Է¹��� ������ ���, 0 , �������� �Ǻ� �� ����ϱ�
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է����ּ��� : ");
		int num = sc.nextInt();
		// 2 1 0 -1 -2
		// 1. 0���� �ƴ��� �Ǻ�
		// 2. 0�� �ƴϸ� ������� �������� �Ǻ�
		String result = (num == 0) ? "0�Դϴ�" : (num > 0) ? "����Դϴ�" : "�����Դϴ�" ;
		System.out.println(num + "��/��" + result + "�̴�.");
		
	}
	
}
