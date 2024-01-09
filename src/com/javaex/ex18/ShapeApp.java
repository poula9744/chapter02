package com.javaex.ex18;

public class ShapeApp {

	public static void main(String[] args) {

		//관리를 위한 배열생성
		Rectangle[] rArray = new Rectangle[3];
		Triangle[] tArray = new Triangle[3];
		Circle[] cArray = new Circle[3];
		
		///////////////////////////////////////////////////
		//사각형 생성
		Rectangle r01 = new Rectangle(5, 10, "파랑", "빨강");
		Rectangle r02 = new Rectangle(10, 10, "노랑", "노랑");
		Rectangle r03 = new Rectangle(20, 20, "빨강", "빨강");
		
		//배열에 사각형(주소) 담기
		rArray[0] = r01;
		rArray[1] = r02;
		rArray[2] = r03;
		
		//배열을 통해 사각형 그리기 
		for(int i=0; i<rArray.length; i++) {
			rArray[i].draw();
		}
		
		System.out.println();
		///////////////////////////////////////////////////
		//삼각형 생성
		Triangle t01 = new Triangle(5, 5, "빨강", "파랑");
		Triangle t02 = new Triangle(10, 10, "빨강", "빨강");
		Triangle t03 = new Triangle(20, 20, "노랑", "노랑");
		
		//배열에 삼각형(주소) 담기
		tArray[0] = t01;
		tArray[1] = t02;
		tArray[2] = t03;
		
		//배열을 통해 삼각형 그리기 
		for(int i=0; i<tArray.length; i++) {
			tArray[i].draw();
		}
		System.out.println();
		////////////////////////////////////////////////////
		//원 생성
		Circle c01 = new Circle(5, "빨강", "빨강");
		Circle c02 = new Circle(10, "파랑", "빨강");
		Circle c03 = new Circle(20, "노랑", "노랑");
		
		//배열에 원형(주소) 담기
		cArray[0] = c01;
		cArray[1] = c02;
		cArray[2] = c03;
		
		//배열을 통해 원형 그리기 
		for(int i=0; i<cArray.length; i++) {
			cArray[i].draw();
		}
		
	}

}
