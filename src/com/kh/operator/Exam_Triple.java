package com.kh.operator;

public class Exam_Triple {
	/*
	 * ���׿����� �׸��� 3�� (���ǽ�) ? ���� �� ����� �� : ������ �� ����� �� 
	 * ���ǽ��� �ݵ�� true or false �� �������� �ۼ� 
	 * ��/�� ������ �ַ� ���
	 */
	public static void main(String [] args) {
		//���� �����ڷ� num�� ¦������ Ȧ������ �Ǻ� �� ���
		// 25 ��/�� Ȧ���̴�.
		int num = 34;
		
		String result = (num%2 == 0) ? "¦��" : "Ȧ��" ;
		//String result2 = (num%2 !=0 ) ? "Ȧ��" : "¦��" ;
		System.out.println(num + " ��/�� " + result + "�̴�.");

		//���� �����ڷ� val���� ������� �������� �Ǻ� �� ���
		int val = 4;
		String str = (val > 0) ? "����̴�" : "����� �ƴϴ�." ;
		System.out.println(val + "��/�� " + str);
		
	}
}
