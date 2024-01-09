package com.javaex.ex19;

public class ShapeApp {

	public static void main(String[] args) {
		
		//도형(부모) --> 자식을 데리고 오지 않음
		Shape s01 = new Shape();
		s01.setFillColor("노랑");
		s01.setLineColor("검정");
				
		System.out.println(s01.toString());
		
		//사각형(자식)
		Rectangle r01 = new Rectangle();
		r01.setWidth(3);
		r01.setHeight(30);
		r01.setFillColor("빨강");
		r01.setLineColor("검정");
		//System.out.println(r01.toString());
		
		Rectangle r02 = new Rectangle(40, 40, "파랑", "검정");
		//System.out.println(r02.toString());
		
		Rectangle[] rArray = new Rectangle[2];
		rArray[0] = r01;
		rArray[1] = r02;
		
		//삼각형(자식)
		Triangle t01 = new Triangle();
		t01.setWidth(3);
		t01.setHeight(4);
		t01.setFillColor("노랑");
		t01.setLineColor("파랑");
		System.out.println(t01.toString());
		
		Triangle t02 = new Triangle(10, 10, "검정", "검정");
		System.out.println(t02.toString());
		
		//원형(자식)
		Circle c01 = new Circle();
		c01.setRadius(5);
		c01.setFillColor("파랑");
		c01.setLineColor("빨강");
		System.out.println(c01.toString());
		
		Circle c02 = new Circle(10, "검정", "파랑");
		System.out.println(c02.toString());
		
	}

}
