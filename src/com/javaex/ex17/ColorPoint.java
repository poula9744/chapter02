package com.javaex.ex17;

public class ColorPoint extends Point {

	//필드
	private String color;
	
	
	//생성자
	public ColorPoint() {
		System.out.println("ColorPoint(1)");
	}
	
	public ColorPoint(String color) {
		//디폴트 생성자 Point()
		this.color = color;
		System.out.println("ColorPoint(2)");
	}
	
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color; 
		System.out.println("ColorPoint(3)");
	}
	
	//메소드 - g/s
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	//메소드 - 일반 
	public String toString() {
		return "ColorPoint [color=" + color + "]";
	}
	//같은 이름일 때, 본인 것 부터 
	//부모 메소드를 사용하고 싶다면, 지우거나 다른 이름으로 만들기
	
	public void showInfo() {
		System.out.println("x는 "+ getX() + "이고, y는 " + getY() + "이고, 색은 " + color + "이다");
	}
	
	
	
}
