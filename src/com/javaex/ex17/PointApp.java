package com.javaex.ex17;

public class PointApp {

	public static void main(String[] args) {
		
		//point(2)
		Point p = new Point(4, 4);
		
		System.out.println(p.toString());
		p.showInfo();
		//p.x; --> protected는 자식 외에는 안됨
		//p.setX(3); --> 은 가능
		
		System.out.println("-------------------------------");
		
		//point(1) -> colorPoint(2)
		ColorPoint cp1 = new ColorPoint("red");
		
		System.out.println(cp1.toString());
		cp1.showInfo();
		
		System.out.println("-------------------------------");
		
		//Point(2) -> colorPoint(3)
		ColorPoint cp2 = new ColorPoint(10, 10, "blue");
		
		System.out.println(cp2.toString());
		cp2.showInfo();
	}

}
