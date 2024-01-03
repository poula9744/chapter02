package com.javaex.ex06;

public class Point {
	
	//필드
	double x;
	double y;
	double z;
	
	//연산자
	
	//메소드 - g/s
	public void setX(double x) {
		this.x = x;
	}
	public void setY(double y ) {
		this.y = y;
	}
	public void setZ(double z) {
		this.z = z;
	}
	
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public double getZ() {
		return z;
	}
	
	
	//메소드 - 일반
	
	public void sum() {
		double q = x + y + z;
		System.out.println("합은 " + q + "입니다.");
	}
	
	public void size() {
		if(x>y && x>z) {
			System.out.println("x로 치우침");
		} else if(y>x && y>z) {
			System.out.println("y로 치우침");
		} else if(z>x && z>y) {
			System.out.println("z로 치우침");
		} else {
			System.out.println("균등");
		}
	}
	
	public void showInfo() {
		System.out.println("x좌표는 " + x + "이고, " + "z좌표는 " + z + "이다.");
		System.out.println();
	}
	
}
