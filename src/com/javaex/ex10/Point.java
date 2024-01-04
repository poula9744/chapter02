package com.javaex.ex10;

public class Point {
	
	//필드
	private int x;
	private int y;
	
	//생성자
	//Alt + shift + s --> generate constructor using Field
	public Point() {
		super();
	}
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	
	//메소드 - g/s
	public int getX() {
		if(x<0) {
			return 0;
		} else {
			return x;
		}
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
		System.out.println("점[x= " + this.x + ", y= " + this.y + "]을 그렸습니다.");
	}
	public void delete() {
		System.out.println("점[x= " + this.x + ", y= " + this.y + "]을 지웠습니다.");
	}
	
	//변수 이름이 같아도 파라미터가 다르면 쓸 수 있다
	// == 메소드 오버로딩
	public void draw(boolean action) {
		if(action == true) {
			System.out.println("점[x= " + this.getX() + ", y= " + this.y + "]을 그렸습니다.");
		} else {
			System.out.println("점[x= " + this.getX() + ", y= " + this.y + "]을 지웠습니다.");
		}
	}
	


}
