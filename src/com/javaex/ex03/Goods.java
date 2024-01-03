package com.javaex.ex03;

public class Goods {
	
	//필드
	private String name;
	private int price;
	
	
	//생성자
	
	//메소드 - g/s

	
	/*
	 * public void setName(String n) {
		name = n;
		} n이라고 하면 알아보기 어려움 
	 *  name으로 바꾸면, 
	 *  name = name은 혼동이 있어서 
	 *  this.name으로 바꿔줌 
	 *  this.name은 computer.name / camera.name 등 이다.
	 */
	
	public void setName(String name) {
		this.name = name;
	} //this는 헷갈릴까봐 쓰는 용도
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	//메소드 - 일반
	
	public void showInfo() {
		System.out.println("---------------------------");
		System.out.println("상품명: "+ this.name + ", 가격: " + this.price);
		System.out.println("---------------------------");
	}
}


