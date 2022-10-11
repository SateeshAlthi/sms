package com.tyss.collectionsdemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<>();
		set.add(12);
		set.add(24);
		set.add(36);
		set.add(48);
		set.add(60);
System.out.println(set);
		
		set.add(400);
		set.add(100);
		set.add(4);
		System.out.println(set);
		
		set.add(1);
		System.out.println(set);
		
		System.out.println("for each loop");
		for(int i: set) {
			System.out.println(i); 
		}
		System.out.println("size of set : "+set.size());
		
		Iterator<Integer> it = set.iterator();
		System.out.println("first element: "+ it.next());
        while (it.hasNext()) {
        	System.out.println(it.next());
        }

	}

}
