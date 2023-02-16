package org.tnsif.exceptionhandlingdemo;

import java.util.Scanner;
//program to demonstrate multiple catch block
public class MultipleCatchBlockDemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] arr= new int[] {11,22,444,23};
		System.out.println("Enter the value of a and b: ");
		int a= s.nextInt();
		int b= s.nextInt();
		try {
			int c = a/b;
			System.out.println(c);
			System.out.println(arr[4]);
		}
		//we can use multiple catch block
		/*
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception" +e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out Of Bounds Exception");
		}
		*/
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception handled: "+e);
		}
	}

}