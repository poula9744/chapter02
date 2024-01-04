package com.javaex.ex07;

public class Goods {

	//필드
	private String name;
	private int price;
	
	
	//생성자
	//1
	public Goods() { 
		//아무것도 쓰지 않아도 자동으로 해줌
		//메모리에 올리는 일(클래스를 인스턴스화)
		System.out.println("Goods()");
	}
	
	//2
	public Goods(String name) {
		this.name = name; //추가
		System.out.println("Goods(name)");
	}
	//생성자를 아무것도 안적으면, 디폴트값으로 적용했음. 알아서 적용
	//생성자를 적으면, 디폴트값이 없어짐.
	
	//3
	public Goods(String name, int price) {
		this(name); //2번에 있는 내용을 먼저 메모리에 올림
		//2번에 9개의 규칙이 있고 3번에서 하나만 추가하고 싶다면, this()를 사용
		this.price = price;
		System.out.println("Goods(name, price)");
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
	
	
	//메소드 - 일반
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + "]";
	}

	
	
}
