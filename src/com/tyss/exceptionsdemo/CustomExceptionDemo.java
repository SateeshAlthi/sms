package com.tyss.exceptionsdemo;


class MyException extends RuntimeException {
	public MyException(String s) {
		System.out.println(s);
	}
}

public class CustomExceptionDemo {

public static void main(String[] args) {
		try {
			int a, b, c;
			a = 5;
			b = 0;
			if (b == 0)
				throw new MyException("Some error occured");
			else
				c = a / b;
		} catch (MyException ex) {
			System.out.println("Handled UserDefined Excpetion");
		}
	}
}

