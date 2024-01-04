package com.javaex.ex07;

public class GoodsApp {

	public static void main(String[] args) {
		
		//camera
		//1번을 적지않고, 2번만 적는다면 오류가 생김
		//아무것도 적지 않아도 오류가 생기지 않음
		Goods camera = new Goods();
		camera.setName("니콘");
		camera.setPrice(400000);
		System.out.println(camera.toString());
		
		
		//computer
		//2번을 적지 않으면 오류가 생김
		//아무것도 적지 않으면 오류가 생김
		Goods computer = new Goods("LG그램");
		//computer.setName("LG그램");
		computer.setPrice(900000);
		System.out.println(computer.toString());
		
		//cup
		Goods cup = new Goods("머그컵", 3000);
		System.out.println(cup.toString());
	}

}
