package com.tyss.collectionsdemo;

import java.util.ArrayList;

public class ArrayListDemo {

public static void main(String[] args) {
		
		// creating an arraylist
		ArrayList<String> list = new ArrayList <>();
		
		// adding elements in the list
		list.add("Mike");
		list.add("John");
		list.add("Mark");
		list.add("Phil");
		list.add("Rock");

		System.out.println(list);
	 
     	// REPLACING  the value at (a specific) index 2. Now Mark will be replaced with Kevin
		list.set(2, "Kevin");
		System.out.println(list);
		
		// removing an element
		list.remove(2);
		System.out.println(list);

		// access an element
	    System.out.println(list.get(3));

	    ArrayList<String> list1 = new ArrayList<>();
	    list1.add("Start");
	    list1.add("End");
	    System.out.println(list1);
	    list1.addAll(1,list);
	    System.out.println(list1);
//We are adding elements(always at the end) to list1, which elements means, the elements of list(for loop written for list)      
	    for (String i:list) {
	    	list1.add(i);
	    }
        System.out.println(list1);
        list1.removeAll(list1);
        System.out.println(list1);
       
         
	 for (int i=0; i<list.size(); i++) {
     	System.out.println(list.get(i));
     }	
      System.out.println(list.get(0));
      System.out.println(list);
	
}
     
	
}
