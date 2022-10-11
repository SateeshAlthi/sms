package com.tyss.exceptionsdemo;

import java.util.Scanner;

public class Addition {
	
	public static void main(String[] args) {

		String ch;
		Scanner sc = new Scanner(System.in);
		do {
			try {
				int a, b, c;
				System.out.println("Enter first Number: ");
				a = Integer.parseInt(sc.nextLine());
				System.out.println("Enter Second Number: ");
				b = Integer.parseInt(sc.nextLine());
				c = a + b;
				System.out.println("The value of C is: " + c);

			} catch (NumberFormatException ex) {
				System.out.println("Number Format Exception");
			} catch (Exception ex) {
				System.out.println("Some Exception Occured.Please contact admin");
			}
			System.out.println("Do you want to try again: Y/N: ");
			ch = sc.nextLine();
		} while (ch.equalsIgnoreCase("y"));
		System.out.println("Thanks for using this application");
		sc.close();
	}

}
