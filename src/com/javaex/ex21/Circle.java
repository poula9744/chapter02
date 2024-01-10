package com.javaex.ex21;

public class Circle extends Shape {
	
	// 필드
	private int radius;

	// 생성자
	public Circle() {
	}

	public Circle(int radius, String fillColor, String lineColor) {
		super(fillColor, lineColor);
		this.radius = radius;
	}

	// 메소드 - g/s
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	// 메소드 - 일반
	public String toString() {
		return "Circle [radius=" + radius + ", fillColor=" + getFillColor() + ", lineColor=" + getLineColor() + "]";
	}
	
	public void draw() {
		System.out.println("사각형을 그렸습니다.");
		System.out.println("반지름: " + radius);
		System.out.println("면색: " + fillColor);
		System.out.println("선색: " + lineColor);
		System.out.println("-------------------");
	}
	public double area() {
		return radius*radius*3.14;
	}
	
}
