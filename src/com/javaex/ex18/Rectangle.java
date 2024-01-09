package com.javaex.ex18;

public class Rectangle {

	// 필드
	private int width;
	private int height;
	private String fillColor;
	private String lineColor;

	// 생성자
	public Rectangle() {
	}

	public Rectangle(int width, int height, String fillColor, String lineColor) {

		this.width = width;
		this.height = height;
		this.lineColor = lineColor;
		this.fillColor = fillColor;

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

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	// 메소드 - 일반
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", fillColor="
				+ fillColor + ", lineColor=" + lineColor + "]";
	}
	
	public void draw() {
		System.out.println("============사각형을 그리시오=============");
		System.out.println("가로: " + width + " 세로: " + height  + " 면 색: " + fillColor + " 선 색: " + lineColor);
		System.out.println("=====================================");
	}

}
