package com.tyss.collectionsdemo;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;


public class HashMapDemo {

	public static void main(String[] args) {
		 
		
		HashMap<Integer, String> map = new HashMap<>();
		
		// add values into hashmap
		map.put(1, "ajay");
		map.put(2134132, "vishal");
		map.put(21, "bhagyashri");
		map.put(12, "jehangir");
		map.put(14, "rohan");
		System.out.println(map);
		
		// removing an element
		map.remove(14);
		System.out.println(map);
		
		map.put(1, null);
		System.out.println(map);
		
		map.put(112, "bhagyashri");
		System.out.println(map);
		
		
		map.put(null, "value-for-key-null");
		System.out.println(map);
		map.put(null,null);
		System.out.println(map);
		map.put(null,"sat");
		
		System.out.println(map.containsKey(1222));
		System.out.println(map.keySet());
		System.out.println(map.entrySet());
		System.out.println(map.values());
//		it will not account for iterator value
//		for(int i:map.keySet()) {
//			System.out.println(map.get(i));
//		}
		
		Iterator<Integer> it = map.keySet().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		Iterator<String> it2 = map.values().iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		
		for( Entry<Integer, String> a : map.entrySet()) {
			System.out.println("Key is : "+ a.getKey() + ". value is : "+ a.getValue());
		}
	}
}

