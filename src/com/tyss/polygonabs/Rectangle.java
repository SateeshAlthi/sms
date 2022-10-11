package com.tyss.polygonabs;

public class Rectangle extends Polygon {

	@Override
	void calcArea(int length, int breadth) {
		System.out.println("Rectangle Class");
		area = 3 * length * breadth;

	}

}
