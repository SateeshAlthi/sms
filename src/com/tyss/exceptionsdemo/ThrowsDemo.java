package com.tyss.exceptionsdemo;

public class ThrowsDemo {

	public static void division() throws ArithmeticException{
		int a, b, c;
		a = 10;
		b = 0;
		c = a / b;
		System.out.println("The Value of C is: " + c);
	}
	public static void arrayindex() throws ArrayIndexOutOfBoundsException{
		int[] arr= {0,1,2,3,4,5};
		System.out.println(arr[7]);
	}

	public static void main(String[] args) {
		
		try {
		division();
		arrayindex();
		
		} 
		catch(ArithmeticException ex) {
			System.out.println("can not divide with Zero");	
		}catch( ArrayIndexOutOfBoundsException ex) {
			System.out.println("Array Index is out of Bound");	
		}
	}

}
