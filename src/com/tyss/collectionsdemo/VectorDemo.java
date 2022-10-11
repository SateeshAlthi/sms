package com.tyss.collectionsdemo;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		 //Create a vector  
        Vector<String> vec = new Vector<String>();  
        //Adding elements using add() method of List  
        vec.add("Tiger");  
        vec.add("Lion");  
        vec.add("Dog");  
        vec.add("Elephant");  
        //Adding elements using addElement() method of Vector  
        vec.addElement("Rat");  
        vec.addElement("Cat");  
        vec.addElement("Deer");  
          
        System.out.println("Elements are: "+vec);  
        
      //Check size and capacity  
        System.out.println("Size is: "+vec.size());  
        System.out.println("Default capacity is: "+vec.capacity());  
     }  
	}

