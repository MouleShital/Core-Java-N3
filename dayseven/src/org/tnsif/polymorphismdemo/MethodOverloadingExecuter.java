package org.tnsif.polymorphismdemo;

import java.util.Scanner;

//program to demonstrate on method overloading
//driver class
public class MethodOverloadingExecuter {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the resolution and slottype of a cellphone");
		int resoltuion = s.nextInt();
		s.nextLine();
		String slottype = s.nextLine();
		Smartphone sp = new Smartphone();
		sp.setResolution(resoltuion);
		sp.setSlottype(slottype);
		sp.display(resoltuion);
		sp.display(resoltuion, slottype);
		
		Multiplication m = new Multiplication();
		System.out.println("Multiplication: ");
		System.out.println(m.mul(11, 5));
		System.out.println(m.mul(5.2f, 3));
		

	}

}
