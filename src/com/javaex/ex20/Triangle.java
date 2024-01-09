package com.javaex.ex20;

public class Triangle extends Shape {
	// 필드
	private int width;
	private int height;

	// 생성자
	public Triangle() {
	}

	public Triangle(int width, int height, String fillColor, String lineColor) {
		super(fillColor, lineColor);
		this.width = width;
		this.height = height;
	}

	// 메소드 - g/s
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	// 메소드 - 일반
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height + ", fillColor=" + getFillColor() + ", lineColor="
				+ getLineColor() + "]";
	}
	public void draw() {
		System.out.println("삼각형을 그렸습니다.");
		System.out.println("가로: " + width);
		System.out.println("세로: " + height);
		System.out.println("면색: " + getFillColor());
		System.out.println("선색: " + getLineColor());
		System.out.println("-------------------");
	}
}
