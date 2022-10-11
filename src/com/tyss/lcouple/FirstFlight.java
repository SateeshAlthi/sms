package com.tyss.lcouple;

public class FirstFlight implements Courier {

	@Override
	public void deliver(int pid) {
		System.out.println("The Product with "+ pid + " Delivered through FirstFlight");
	}
}
