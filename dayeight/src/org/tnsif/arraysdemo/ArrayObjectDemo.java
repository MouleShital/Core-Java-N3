package org.tnsif.arraysdemo;

import java.util.Scanner;

public class ArrayObjectDemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Student arr[];
		System.out.println("Enter the no. of elements in the array: ");
		int n = s.nextInt();
		arr = new Student[n];
		int i = 0;
		while(i<n)
		{
			arr[i] = new Student(s.nextInt(), s.next(), s.nextFloat());
			i++;
		}
		
		for (int j=0; j<n; j++)
		{
			System.out.println(arr[j].getRollno() +" "+arr[j].getName()+" "+arr[j].getPercentage());
		}
	}

}
