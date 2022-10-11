package com.tyss.polygonabs;

public class PolyMain{
	
	public static void main(String[] args) {
		
		Polygon poly;
			
		poly = new Triangle();
		poly.calcArea(2, 3);
		poly.displayArea();
		
		
		poly = new Rectangle();		
		poly.calcArea(2, 3);
		poly.displayArea();
	}
	
}
