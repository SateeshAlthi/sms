package com.tyss.lcouple;

import java.util.Scanner;

public class CourierMain {

	public static void main(String[] args)  {
		Courier c1 = new FirstFlight();
		FlipKart fp = new FlipKart(c1);
		fp.send(12);
		
		c1= new DTDC();
		FlipKart fp2 = new FlipKart(c1);
		fp2.send(123);	
		
//		Scanner sc = new Scanner();
//		String s = sc.next();
		
		
	}
}
