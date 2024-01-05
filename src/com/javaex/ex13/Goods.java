package com.javaex.ex13;

public class Goods {
	
	//필드
	private String name;
	private int price;
	public static int count; //static
	
	//생성자
	public Goods() {
		count = count + 1; //추가
	}
	
	public Goods(String name, int price) {
		super();
		this.name = name;
		this.price = price;
		count = count + 1; //추가
	}
	
	//메소드 - g/s
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCount() {
		return count;
	}
	
	//메소드 -일반 
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + ", count=" + count + "]";
	}
	
	
	
}
