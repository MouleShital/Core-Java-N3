package org.tnsif.assignmentFunctionRecursion;

import java.util.Scanner;

//to demonstrate the example of addition of two numbers using function
public class AdditionDemo {
	
	//function definition
	/*
	static int addition(int x, int y) {
		int sum=x+y;
		return sum;
	}
	*/
	
	static void addition(int x, int y)
	{
		int sum=x+y;
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of x and y: ");
		int a=s.nextInt();
		int b=s.nextInt();
		
		//function call
		addition(a, b);
		s.close();
//		System.out.println(addition(a, b));
		
	}

}
