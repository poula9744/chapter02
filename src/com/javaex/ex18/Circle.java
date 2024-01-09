package com.javaex.ex18;

public class Circle {

	//필드
	private int radius;
	private String fillColor;
	private String lineColor;
	
	//생성자
	public Circle() {
	}
	
	public Circle(int radius, String fillColor, String lineColor) {
		this.radius = radius;
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}
	
	//메소드 - g/s
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public String getFillColor() {
		return fillColor;
	}
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	public String getLineColor() {
		return lineColor;
	}
	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	
	//메소드 - 일반
	public String toString() {
		return "Circle [radius=" + radius + ", fillColor=" + fillColor + ", lineColor=" + lineColor + "]";
	}
	
	public void draw() {
		System.out.println("===========원을 그리시오============");
		System.out.println("반지름: " + radius  + " 면 색: " + fillColor + " 선 색: " + lineColor);
		System.out.println("=================================");
	}
	
}
