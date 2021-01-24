package com.kh.operator;

public class Exam_Logical {
	/*
	 * 논리연산자 : 논리값 두개를 비교하는 연산자 
	 * AND: &&, (~이고, ~면서, 그리고) 
	 * OR : ||, (~이거나, 또는)
	 */
	public static void main(String [] args) {
		System.out.println("======= 논리 연산자 =======");
		System.out.println("===========예제1===========");
		// 50, 30을 입력받아 다음과 같은 식을 작성하였을 때 결과 값을 출력하자
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

		System.out.println("==========예제1 끝=========");	
		System.out.println("===========예제2===========");
		// 70, 55를 a,b로 입력받아 다음과 같은 식을 작성하였을 때 결과 값을 출력하자
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
		System.out.println("a의 값 : " + aNum + " , b의 값 : " + bNum);
		
		
		System.out.println("==========예제2 끝=========");	
	}
}
