package com.tyss.exceptionsdemo;

public class MulticatchDemo {

	public static void main(String[] args) {
		try {
			
			String s=null;
			System.out.println(s.length());
			
			int a = 10;
			int b = 0;
			int c = a / b;
			System.out.println("The Value of C is: " + c);

			int[] arr = new int[] { 1, 2, 3 };
			System.out.println(arr[3]);
		} catch (NullPointerException | ArithmeticException | ArrayIndexOutOfBoundsException  ex) {
//			ex.printStackTrace();
			System.out.println(ex.getLocalizedMessage());
		}
	}
}
