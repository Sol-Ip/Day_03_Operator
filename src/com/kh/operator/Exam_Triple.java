package com.kh.operator;

public class Exam_Triple {
	/*
	 * 삼항연산자 항목이 3개 (조건식) ? 참일 때 사용할 식 : 거짓일 때 사용할 식 
	 * 조건식을 반드시 true or false 가 나오도록 작성 
	 * 비교/논리 연산자 주로 사용
	 */
	public static void main(String [] args) {
		//삼항 연산자로 num이 짝수인지 홀수인지 판별 후 출력
		// 25 은/는 홀수이다.
		int num = 34;
		
		String result = (num%2 == 0) ? "짝수" : "홀수" ;
		//String result2 = (num%2 !=0 ) ? "홀수" : "짝수" ;
		System.out.println(num + " 은/는 " + result + "이다.");

		//삼항 연산자로 val값이 양수인지 음수인지 판별 후 출력
		int val = 4;
		String str = (val > 0) ? "양수이다" : "양수가 아니다." ;
		System.out.println(val + "은/는 " + str);
		
	}
}
