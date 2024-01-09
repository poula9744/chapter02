package com.javaex.ex20;

public class Shape {
	
	// 필드
	protected String fillColor;
	protected String lineColor;

	// 생성자
	public Shape() {
	}

	public Shape(String fillColor, String lineColor) {
		super();
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}

	// 메소드 - g/s
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

	// 메소드 - 일반
	public String toString() {
		return "Shape [fillColor=" + fillColor + ", lineColor=" + lineColor + "]";
	}
	
	//shape에 없어도 되는데 // 없으면 도형 내 draw()가 보이지 않아서 오버라이딩으로 보이게 설정하고자 함
	public void draw() {
		System.out.println("shape.draw()");
	}
}
