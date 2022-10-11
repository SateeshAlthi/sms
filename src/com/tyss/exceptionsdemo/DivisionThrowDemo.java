package com.tyss.exceptionsdemo;

public class DivisionThrowDemo {

	public static void main(String[] args) {

		try {
			String data = "abc";
			int a, b, c;
			a = Integer.parseInt(data);
			b = 0;
			if (b == 0)
				throw (new ArithmeticException("Can not divide with Zero"));
			else
				c = a / b;
			System.out.println("The Value of c is: " + c);
		} catch (ArithmeticException ex) {
			System.out.println(ex.getMessage());
		} catch (NumberFormatException ex) {
			System.out.println("Only numbers are allowed for division");
		} catch (Exception ex) {
			System.out.println("Some Exception Occured.Please contact admin");
		} finally {
			System.out.println("Thank you for using this application");
		}
	}
}
