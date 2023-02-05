package org.tnsif.LoopingQuestion;

import java.util.Scanner;

//program to count digits in integer
public class CountingDigitDemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int count=0;
		System.out.println("Enter an Integer: ");
		int num = s.nextInt();
		while(num!=0)
		{
			num=num/10;
			count++;
		}
		System.out.println("Number of Digits in a given Integer is: "+count);
	}

}