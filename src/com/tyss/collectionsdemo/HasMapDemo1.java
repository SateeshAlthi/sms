package com.tyss.collectionsdemo;

import java.util.HashMap;
import java.util.Map.Entry;

public class HasMapDemo1 {
		
	public static void main(String[] args) {

		int nos[]= new int[]{21,22,23,24,25};
		String age[]= new String[] {"ram","prem","rahul","raj","kiran"};
		HashMap<Integer, String> map = new HashMap<>();
		map.put(nos[0],age[0] );
		map.put(nos[1],age[1] );
		map.put(nos[2],age[2] );
		map.put(nos[3],age[3] );
		map.put(nos[4],age[4] );
		System.out.println(map);
		
		for (Entry<Integer, String> a : map.entrySet()) {
			System.out.println("The Person Name: " + a.getValue()+" & His Age: " + a.getKey() );
		}
		
	}
	
	
	

}
