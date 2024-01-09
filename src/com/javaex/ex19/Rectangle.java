package com.javaex.ex19;

public class Rectangle extends Shape {

	//필드
	private int width;
	private int height;
	
	//생성자
	public Rectangle() {
		//super();
	}

	public Rectangle(int width, int height, String fillColor, String lineColor) {
	/*	super();
		super.setFillColor(fillColor);
		super.setLineColor(lineColor); */
		super(fillColor, lineColor);
		this.width = width; 
		this.height = height;
	}

	//메소드 - g/s
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

	//메소드 - 일반
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", fillColor=" + getFillColor() + ", lineColor=" + getLineColor() + "]";
	}
	
	
}
