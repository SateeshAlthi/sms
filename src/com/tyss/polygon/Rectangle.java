package com.tyss.polygon;

public class Rectangle extends Polygon {

	@Override
	public void area(int length, int breadth) {
		System.out.println("The Area of Rectangle is " + 3*length * breadth);
	}

}
