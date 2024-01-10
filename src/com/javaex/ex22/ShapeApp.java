package com.javaex.ex22;

public class ShapeApp {

	public static void main(String[] args) {
		
		//Drawable 배열만들기
		Drawable[] dArray = new Drawable[4];
		
		
		//그릴 수 있는 애 Drawable
		//사각형
		Drawable d01 = new Rectangle(100, 100, "빨강", "빨강");
		
		//점
		Drawable d02 = new Point(2,2);
		
		//원
		Drawable d03 = new Circle(5, "빨강", "파랑");
		
		//삼각형
		Drawable d04 = new Triangle(10, 10, "검정", "노랑");
		
		//배열에 주소 넣기
		dArray[0] = d01; //사각형
		dArray[1] = d02; //점
		dArray[2] = d03; //원
		dArray[3] = d04; //삼각형
		
		for(int i=0; i<dArray.length; i++) {
			dArray[i].draw();
		}
		
		//사각형의 가로
		System.out.println(((Rectangle)dArray[0]).getWidth());
		
		//원의 넓이
		System.out.println(((Circle)dArray[2]).area());
		System.out.println(((Shape)dArray[2]).area());
		
		//점 y의 값 
		System.out.println(((Point)dArray[1]).getY());
		
		System.out.println("---------------------------");
		//전체에서 도형의 넓이를 출력
		for(int i=0; i<dArray.length; i++) {
			
			if(dArray[i] instanceof Shape) {//dArray[i]의 주소가 Shape의 인스턴스니???
				//현재 배열의 방(주소)를 따라가면 Shape이 있으면 
				System.out.println(((Shape)dArray[i]).area());
			}	
		
		}
	}
}
