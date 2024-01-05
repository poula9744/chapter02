package com.javaex.ex14;

public class Math {
	
	//필드
	
	//생성자
	//	디폴트 생성자 사용 
	
	//메소드 - g/s
	
	//메소드 - 일반
	//static 사용
	public static int plus(int a, int b) {
		return a+b;
	}
	
	public static double plus(double a, int b) {
		return a+b;
	}
	
	public static double plus(int a, double b) {
		return a+b;
	}
	
	public static double plus(double a, double b) {
		return a+b;
	}
	
	public static double pi = 3.14;
	
	public static double circleArea(int radius) {
		return pi*radius*radius;
		//static에 올리면서 3.14를 pi로 쓰고 싶다면 
		//pi역시 static에 올려줘야 한다. 
		
	}
	
	
	
	
	
}
