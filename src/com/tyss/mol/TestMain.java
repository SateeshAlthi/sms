package com.tyss.mol;

public class TestMain {
	
	public static void main(String[] args) {
		Test t = new Test();
		
		t.add();
		t.add(1, 2);
		System.out.println(t.add("abc", "def"));
		
	}

}
