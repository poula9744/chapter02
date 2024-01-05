package com.javaex.ex15;

public class GoodsApp {

	public static void main(String[] args) {
		
		//배열만들기
		Goods[] goodsArray = new Goods[5];
		
		//상품만들기
		Goods camera = new Goods("니콘", 400000);
		Goods computer = new Goods("LG그램", 900000);
		Goods cup = new Goods("머그컵", 2000);
	
		//배열에 상품 넣기
		goodsArray[0] = camera;
		goodsArray[1] = computer;
		goodsArray[2] = cup;
		
		/*
		goodsArray[0].showInfo();
		goodsArray[1].showInfo();
		goodsArray[2].showInfo();
		*/
		
		int count = 0;
		for(int i=0; i<goodsArray.length; i++) {
			if(goodsArray[i] !=null) { //null: 주소가 없다
				goodsArray[i].showInfo();
				count += 1;
			}
		}
		System.out.println("전체상품개수: " + count);
	}

}
