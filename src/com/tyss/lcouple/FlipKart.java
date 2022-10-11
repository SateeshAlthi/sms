package com.tyss.lcouple;

public class FlipKart {
	
	Courier courier;
	
	FlipKart(Courier courier){
		this.courier=courier;
	}
	
	public void send(int pid) {
		
		courier.deliver(pid);	
	}
}
