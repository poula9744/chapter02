package com.javaex.ex06;

import java.util.Scanner;

public class PointApp {

	public static void main(String[] args) {
		
		//p1
		
		Point p1 = new Point();
		
		p1.setX(0);
		p1.setY(5.8);
		p1.setZ(5.8);
		
		//p2
		Point p2 = new Point();
		
		p2.setX(9.1);
		p2.setY(8.8);
		p2.setZ(10);
		
		//p3
		Point p3 = new Point();
		p3.setX(2.3);
		p3.setY(1.1);
		p3.setZ(0.6);
		
		//p4
		Point p4 = new Point();
		Scanner sc = new Scanner(System.in);
		System.out.println("x, y, z 값을 각각 입력하시오.");
		p4.setX(sc.nextDouble());
		p4.setY(sc.nextDouble());
		p4.setZ(sc.nextDouble());
		

		
		//출력
		p1.sum();
		p1.size();
		p1.showInfo();
		
		p2.sum();
		p2.size();
		p2.showInfo();
		
		p3.sum();
		p3.size();
		p3.showInfo();
		
		p4.sum();
		p4.size();
		p4.showInfo();
		
		sc.close();
	}

}
