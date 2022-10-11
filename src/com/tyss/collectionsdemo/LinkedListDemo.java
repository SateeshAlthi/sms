package com.tyss.collectionsdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {

		List<Integer> mainLinkedList = Arrays.asList(11, 12, 13, 14, 15, 16, -17,-18,-19,11,12,13,14,15,16);
		System.out.println("MainLinkedList: " + mainLinkedList);
		List<Integer> listB0 = new ArrayList<>();
//		listB0.add(123);
//		System.out.println("ListB0: "+listB0);
//		*We can add one entire list to a newly created list as per below. 
//		List<Integer> listB1 = new ArrayList<>(listB0);
//		System.out.println("ListB1: "+listB1);
		List<Integer> listB1 = new LinkedList<>();
		List<Integer> listB2 = new LinkedList<>();
		List<Integer> listB3 = new LinkedList<>();
		for (Integer value : mainLinkedList) {
			if (value % 3 == 0 && value>=0)
				listB0.add(value);
			else if (value % 3 == 1 && value>=0)
				listB1.add(value);
			else if (value % 3 == 2 && value>=0)
				listB2.add(value);
			else
				listB3.add(value);
		}
		System.out.println("LinkedList B0: " + listB0);
		System.out.println("LinkedList B1: " + listB1);
		System.out.println("LinkedList B2: " + listB2);
		System.out.println("LinkedList B3: " + listB3);
	}

}
