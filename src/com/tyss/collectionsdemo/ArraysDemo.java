package com.tyss.collectionsdemo;

public class ArraysDemo {

	public static void main(String[] args) {

		int arr[] = new int[6];
		arr[0] = 23;
		arr[1] = 34;
		arr[2] = 45;
		arr[3] = 56;
		arr[4] = 67;
		arr[5] = 78;
		System.out.println(arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + " : " + arr[i]);
		}
		System.out.println("----------------------------- ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("----------------------------- ");
		String arrString[]= new String [2];
		arrString[0]="Ajay";
		arrString[1]="Lenovo";
		for (int i=0; i<arrString.length; i++) {
			System.out.println(i +" : "+arrString[i]);
		}
		System.out.println("----------------------------- ");

		int arrA[] = { 23, 34, 63, 2345, 235, 123, 1234 };
		for (int i = 0; i < arrA.length; i++) {
			System.out.println(i + " : " + arrA[i] );
		}
		System.out.println("----------------------------- ");

		for (int value : arrA) {
			System.out.println(value);

		}

	}
}
