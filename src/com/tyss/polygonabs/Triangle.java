package com.tyss.polygonabs;

public class Triangle extends Polygon{
	
	@Override
	void calcArea(int length, int breadth) {
		System.out.println("Triangle Class");
		area = 2*length*breadth;
		
	}
}
