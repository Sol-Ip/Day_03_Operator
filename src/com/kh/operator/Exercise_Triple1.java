package com.kh.operator;

import java.util.Scanner;

public class Exercise_Triple1 {
	//삼항 연산자 중첩 사용
	//입력받은 정수가 양수, 0 , 음수인지 판별 후 출력하기
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력해주세요 : ");
		int num = sc.nextInt();
		// 2 1 0 -1 -2
		// 1. 0인지 아닌지 판별
		// 2. 0이 아니면 양수인지 음수인지 판별
		String result = (num == 0) ? "0입니다" : (num > 0) ? "양수입니다" : "음수입니다" ;
		System.out.println(num + "은/는" + result + "이다.");
		
	}
	
}
