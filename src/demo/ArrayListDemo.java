package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		System.out.println(list.size() + " : " + list);
		list.add(new Integer(10));
		list.add(30);
		list.add(10);
		System.out.println(list.size() + " : " + list);
		list.add(1, 20);
		System.out.println(list.size() + " : " + list);
		List<Integer> arraylist = Arrays.asList(12, 34, 56, 34, 67, 78, 45);
		list.addAll(1, arraylist);
		System.out.println(list.size() + " : " + list);
		System.out.println(list.get(1));
		System.out.println(list.indexOf(12));
		boolean isElementAvialable = list.contains(12);
		if (isElementAvialable)
			System.out.println("Element Found");
		else
			System.out.println("Element not found");
		list.remove(1);
		System.out.println(list.size() + " : " + list);
		for (int i : list) {
			System.out.println(i);
			
		}
			}

}
