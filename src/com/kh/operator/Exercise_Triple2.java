package com.kh.operator;

import java.util.Scanner;

public class Exercise_Triple2 {
	//���� ������ ��ø ���
	//�� ���� '+' �Ǵ� '-'�� �Է¹޾� �˸��� ��� ��� ����ϱ�
	//��, '+', '-' �̿��� ������ �Է½� "�߸� �Է��ϼ̽��ϴ�!" ����ϱ�
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° �� : ");
		int x = sc.nextInt();
		System.out.print("�ι�° �� : ");
		int y = sc.nextInt();
		System.out.print("������ �Է�(+ or -) : ");
		char op = sc.next().charAt(0);
		//���� ������ ��ø ���
		int result1 = (op == '+') ? x+y : x-y;
		String result = (op == '+') ? x+y+"" : ((op == '-') ? x-y + "" : "�߸��Է��ϼ̽��ϴ�!");

		System.out.println("��� : " + result);
		
				
	}
}
