package com.javaex.ex13;

public class GoodsApp {

	public static void main(String[] args) {
		
		//""메모리에 올리기도 전에"" count를 세고 싶을 때
		System.out.println(Goods.count);
		
		
		Goods camera = new Goods("니콘", 400000);
		System.out.println(camera.toString());

		Goods computer = new Goods("LG그램", 900000);
		System.out.println(computer.toString());
		
		Goods cup = new Goods("머그컵", 9000);
		System.out.println(cup.toString());
		
		//cup.setCount(); //setCount() 없는게 좋다.
		//system.out.println(cup.toString());
		
		
		//공통으로 사용하는데 굳이 하나하나 찾아갈 필요없음
		System.out.println(cup.getCount());
		System.out.println(computer.getCount());
		
		
		System.out.println(Goods.count);
		
	}

}
