package com.tyss.polygonabs;

public abstract class Polygon {
	
	int area;
	
	abstract void calcArea(int length, int breadth);
	
	public void displayArea() {
		System.out.println("The Area is "+ area);
	}
	
}
