package com.kh.operator;

public class Exam_Comparison {

	// �� ������ (���� ������)
	// �� ���� ���ϴ� ������, �ٸ� ���� ���� �����ڶ�� �� 
	// �� �����ڴ� ������ �����ϸ� true, �ƴϸ� false�� ��ȯ ��
	public static void main(String [] args) {
		System.out.println("======= �� ������ =======");
		System.out.println("===========����1===========");
		
		//50, 30�� �Է¹޾� ������ ���� ���� �ۼ��Ͽ��� �� ��� ���� �����غ��� �������
		int a = 50;
		int b = 30;
		boolean result1, result2, result3;
		result1 = ( a < b );
		result2 = (a == b );
		result3 = (a != b );
//		a<b -> true, false
//		a==b
//		a!=b
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		
		System.out.println("==========����1 ��=========");
		System.out.println("===========����2===========");
		// ��������ڿ� �񱳿����ڸ� �Բ� ���� ����
		// a�� Ȧ���ΰ�? b�� ¦���ΰ�? => True or false
		System.out.println("a�� Ȧ���ΰ�? : " + (a%2 != 0));
		System.out.println("a�� ¦���ΰ�? : " + (b%2 == 0));
				
		System.out.println("==========����2 ��=========");
	}
}
