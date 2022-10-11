package com.tyss.lcouple;

public class DTDC implements Courier{

	@Override
	public void deliver(int pid) {
		System.out.println("The Product with "+ pid + " Delivered through DTDC");
	}
	
	

}
