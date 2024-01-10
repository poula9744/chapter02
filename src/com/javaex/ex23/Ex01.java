package com.javaex.ex23;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int no = sc.nextInt();
		
		try {
			double result = 100/no;
			System.out.println(result);
			
		}catch(ArithmeticException e) { //예외 발생했을 때
			System.out.println(e.toString());
			System.out.println("0으로 나눌 수 없습니다.");
			
		}finally {
			System.out.println("finally 영역");
		}
		
		//double result = 100/no; //no에 0을 입력하면 오류남
		//System.out.println(result);
		System.out.println("프로그램 종료");
		
		sc.close();
	}

}
