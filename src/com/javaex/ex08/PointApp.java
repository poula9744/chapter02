package com.javaex.ex08;

public class PointApp {

	public static void main(String[] args) {
		
		Point p0 = new Point();
		p0.setX(2);
		p0.setY(5);
		
		Point p1 = new Point(2);
		p1.setY(22);
		System.out.println(p1.toString());

		Point p2 = new Point(100,100);
		System.out.println(p2.toString());
		
		p0.draw();
		p1.draw();
		p2.draw();
	}

}
