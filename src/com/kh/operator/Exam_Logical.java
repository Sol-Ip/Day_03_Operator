package com.kh.operator;

public class Exam_Logical {
	/*
	 * �������� : ���� �ΰ��� ���ϴ� ������ 
	 * AND: &&, (~�̰�, ~�鼭, �׸���) 
	 * OR : ||, (~�̰ų�, �Ǵ�)
	 */
	public static void main(String [] args) {
		System.out.println("======= �� ������ =======");
		System.out.println("===========����1===========");
		// 50, 30�� �Է¹޾� ������ ���� ���� �ۼ��Ͽ��� �� ��� ���� �������
		// a!=b && a<b
		// a<b || a==b
		// a>b && a!=b
		// a>b || a==b
		int a = 50;
		int b = 30;
		boolean result1, result2, result3, result4 ;
		result1 = (a!=b) && (a<b);
		result2 = (a<b) || (a==b);
		result3 = (a>b) && (a!=b);
		result4 = (a>b) || (a==b);
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		System.out.println("result4 : " + result4);

		System.out.println("==========����1 ��=========");	
		System.out.println("===========����2===========");
		// 70, 55�� a,b�� �Է¹޾� ������ ���� ���� �ۼ��Ͽ��� �� ��� ���� �������
		int aNum = 70;
		int bNum = 55;
		boolean resultOne, resultTwo, resultThree, resultFour ;
		resultOne = (aNum == bNum) || (aNum++ < 100);
		resultTwo = (aNum < bNum) || (--bNum < 55);
		resultThree = (aNum != bNum) && (bNum-- < aNum++);
		resultFour = (aNum++ != bNum) || (bNum++ >= 85);
		
		System.out.println("result1 : " + resultOne);
		System.out.println("result2 : " + resultTwo);
		System.out.println("result3 : " + resultThree);
		System.out.println("result4 : " + resultFour);
		System.out.println("a�� �� : " + aNum + " , b�� �� : " + bNum);
		
		
		System.out.println("==========����2 ��=========");	
	}
}
