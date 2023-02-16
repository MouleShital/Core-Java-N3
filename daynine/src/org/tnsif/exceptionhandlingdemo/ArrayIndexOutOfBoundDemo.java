package org.tnsif.exceptionhandlingdemo;

public class ArrayIndexOutOfBoundDemo {

	public static void main(String[] args) {
		System.out.println("First Line");
		System.out.println("Second Line");
		try{
			int[] myIntArray = new int[] {1,2,3};
			print(myIntArray);
		}
		catch(Exception e) {
			System.out.println("Array does not have Fourth element!");
		}
		System.out.println("Third Line");
	}
	public static void print(int[] arr) {
		System.out.println(arr[3]);
		System.out.println("Fourth element successfully display!");
	}

}
