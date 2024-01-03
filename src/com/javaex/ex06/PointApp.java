package com.javaex.ex06;

import java.util.Scanner;

public class PointApp {

	public static void main(String[] args) {
		
		//p1
		
		Point p1 = new Point();
		
		p1.x=(0);
		p1.y=(5.8);
		p1.z=(5.8);
		
		//p2
		Point p2 = new Point();
		
		p2.x=(9.1);
		p2.y=(8.8);
		p2.z=(10);
		
		//p3
		Point p3 = new Point();
		p3.x=(2.3);
		p3.y=(1.1);
		p3.z=(0.6);
		
		//p4
		Point p4 = new Point();
		Scanner sc = new Scanner(System.in);
		System.out.println("x, y, z 값을 각각 입력하시오.");
		p4.x = sc.nextDouble();
		p4.y = sc.nextDouble();
		p4.z = sc.nextDouble();
		

		
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
