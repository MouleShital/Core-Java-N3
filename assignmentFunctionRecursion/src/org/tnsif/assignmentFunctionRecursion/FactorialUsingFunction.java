package org.tnsif.assignmentFunctionRecursion;

import java.util.Scanner;

//to demonstrate the program for finding a factorial of number

public class FactorialUsingFunction {
	//function definition
	static int factorial(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=i*fact;
		}
		return fact;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the numbers: ");
		int num=s.nextInt();
		//function call
		System.out.println("The factorial of a given number is: "+factorial(num));
		s.close();
	}

}
