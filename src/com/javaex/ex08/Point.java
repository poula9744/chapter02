package com.javaex.ex08;

public class Point {
	
	//필드
	private int x;
	private int y;
	
	
	//생성자
	public Point() {
		//메모리에 올리는 일
		System.out.println("point()");
	}
	public Point(int x) {
		//메모리에 올리는 일
		this.x = x;
		System.out.println("point(int x)");
	}
	
	
/*	public Point(int y) {
		this.y = y;
	} 위에 int x와 int y가 똑같은 것으로 인식해서 오류가 남
	  오버로딩이 되지 않음
*/	
	public Point(int x, int y) {
		this(x);
		this.y = y;
		System.out.println("point(int x, int y)");
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
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	public void draw() {
		System.out.println("점[x= " + x + ", y= " + y + "]을 그렸습니다.");
	}
	
}
