package org.tnsif.exceptionhandlingdemo;

import java.util.Scanner;
//program to demonstrate nested try-catch block
public class NestedTryCatchDemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of a and b: ");
		int a= s.nextInt();
		int b= s.nextInt();
		int arr[] = new int[] {11,22,33};
		try {
			try {
				System.out.println(arr[3]);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Exception handled"+e);
			}
			try {
				int res = a / b;
				System.out.println(res);
			}
			catch(ArithmeticException e) {
				System.out.println("Exception handled"+e);
			}
		}
		finally {
			System.out.println("Finally block");
		}
	}

}
