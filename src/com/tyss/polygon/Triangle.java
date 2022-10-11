package com.tyss.polygon;

public class Triangle extends Polygon {

	@Override
	public void area(int length, int breadth) {
		System.out.println("The Area of Triangle is " + 2 * length * breadth);
	}

}
