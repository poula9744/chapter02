package com.javaex.ex20;

public class ShapeApp {

	public static void main(String[] args) {
		
		//Rectangle r01 = new Rectangle(2, 2, "빨강", "빨강");
		
		Shape[] sArray = new Shape[3];
		
		//부모만 보인다. 자식쪽은 사용 못함 (ex) s01.getHeight 못씀  
		Shape s01 = new Rectangle(20, 20, "빨강", "빨강"); //사각형
		Shape s02 = new Triangle(100, 100, "노랑", "노랑"); //삼각형
		Shape s03 = new Circle(200, "파랑", "파랑"); //원형
		
		sArray[0] = s01;
		sArray[1] = s02;
		sArray[2] = s03;
		
		for(int i=0; i<sArray.length; i++) {
			System.out.println(sArray[i].toString());
		}
		//이름이 똑같으면 자식이 부모를 올라탐. 부모쪽 사용 못함 ==> 오버라이딩 
		
		for(int i = 0; i<sArray.length; i++) {
			sArray[i].draw();        //오버라이딩 
		}
	}

}
