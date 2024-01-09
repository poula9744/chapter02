package com.javaex.ex19;

public class Circle extends Shape {
	
	//필드
	private int radius;
	
	//생성자
	public Circle() {
	}
	public Circle(int radius, String fillColor, String lineColor) {
		super(fillColor, lineColor);
		this.radius = radius;
	}
	
	//메소드 - g/s
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	
	//메소드 - 일반 
	public String toString() {
		return "Circle [radius=" + radius  + ", fillColor=" + getFillColor() + ", lineColor=" + getLineColor() + "]";
	}
	
}
