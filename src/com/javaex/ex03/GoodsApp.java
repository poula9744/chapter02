package com.javaex.ex03;

public class GoodsApp {

	public static void main(String[] args) {
		
		
		//camera.name = "니콘";
		//이름을 private 설정해놔서 안 보임 
		//대신 메소드로 표현해야 함
		
		Goods camera = new Goods();
		
		//camera.name = "니콘"; 
		//private 캡슐화(필드값 보호)
		camera.setName("니콘");
		
		//camera.price = 400000; 
		//private 캡슐화(필드값 보호)
		camera.setPrice(400000);
		
		
		//System.out.println(camera.name);
		System.out.println(camera.getName());
	
		//System.out.println(camera.price);
		System.out.println(camera.getPrice());
		
		
		camera.showInfo();
		
		
		
		//computer 
		Goods computer = new Goods();
		computer.setName("LG그램");
		computer.setPrice(900000);
		
		System.out.println(computer.getName());
		System.out.println(computer.getPrice());
		
		computer.showInfo();
		
	}

}
