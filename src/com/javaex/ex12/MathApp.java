package com.javaex.ex12;

public class MathApp {

	public static void main(String[] args) {
		//
		Math math = new Math();
		
		System.out.println(math.plus(2,3));
		System.out.println(math.plus(100,300));
		System.out.println(math.plus(2.2,5));
		System.out.println(math.plus(5,2.2));
		System.out.println(math.plus(5.5,2.2));
		System.out.println(math.plus("안녕하세요", 3));
		
	}

}
