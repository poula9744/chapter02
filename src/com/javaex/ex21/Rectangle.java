package com.javaex.ex21;

public class Rectangle extends Shape {
	// 필드
	private int width;
	private int height;

	// 생성자
	public Rectangle() {
		// super();
	}

	public Rectangle(int width, int height, String fillColor, String lineColor) {
		/*
		 * super(); super.setFillColor(fillColor); super.setLineColor(lineColor);
		 */
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
		return "Rectangle [width=" + width + ", height=" + height + ", fillColor=" + getFillColor() + ", lineColor="
				+ getLineColor() + "]";
	}

	public void draw() {
		System.out.println("사각형을 그렸습니다.");
		System.out.println("가로: " + width);
		System.out.println("세로: " + height);
		System.out.println("면색: " + getFillColor());
		System.out.println("선색: " + getLineColor());
		System.out.println("-------------------");
	}

	public double area() {
		return width * height;
	}
	
	
}
