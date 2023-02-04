package org.tnsif.decisionmaking;

import java.util.Scanner;

public class NestedIfDemo {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the age and weight of a person:");
		int age=s.nextInt();
		int weight=s.nextInt();
		if(age>=12)
		{
			if(weight>=40)
			{
				if(weight<=120) 
				{
					System.out.println("Eligible for bunjee jumping");
				}
				else
				{
					System.out.println("Extra ropes will be added");
				}
			}
			else
			{
				System.out.println("not eligible for bunjee jumping");
			}
		}
		else
		{
			System.out.println("not eligible for bunjee jumping");
		}

	}

}
