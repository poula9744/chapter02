package com.javaex.ex23;

public class Ex03 {

	public static void main(String[] args) {
		
		Point p01 = new Point(2, 2);
		p01.draw();
		
		Point p02; //다른 곳에서 new 주소만 보내준다.
		System.out.println("안녕하세요");
		
		try {
			p02 = null;
			p02.draw();
		} catch(NullPointerException e) {
			System.out.println("주소값이 없습니다.");
		}
		
		System.out.println("종료");
		//p02 = null; //new Point(100, 100);  ---> 진행이 안 됐을 때. 주소가 안들어감.
		//p02.draw();
	}

}
