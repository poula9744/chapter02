package com.javaex.ex17;

public class Point {
	
	//필드
	protected int x;
	private int y;
	
	//생성자
	public Point() {
		System.out.println("Point(1)");
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Point(2)");
	}

	//메소드 - g/s
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	
	
	//메소드 - 일반 
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	public void showInfo() {
		System.out.println("x는 " + x + "이고, y는 " + y + "입니다.");
	}
	
	
	
}
