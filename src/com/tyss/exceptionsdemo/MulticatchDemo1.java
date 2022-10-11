package com.tyss.exceptionsdemo;

import java.util.Scanner;

public class MulticatchDemo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter second number: ");
		int num2 = sc.nextInt();

		try {
			int num3 = num1 / num2;
		} catch (ArithmeticException e) {
			System.out.println("can not divide with Zero");
			System.out.println("Enter a number other than Zero:");
			int num3 = sc.nextInt();
			System.out.println(num1 / num3);
		}

	}

}
