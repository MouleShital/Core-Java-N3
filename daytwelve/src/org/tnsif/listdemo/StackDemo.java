package org.tnsif.listdemo;

import java.util.Stack;
//program of demonstrate on stack structure 
public class StackDemo {

	public static void main(String[] args) {
		Stack<String> obj = new Stack<>();
		obj.push("Shital");
		obj.push("Pratik");
		obj.push("Bhushan");
		obj.push("Gauri");
		System.out.println("The elements inside the stack are: "+obj);
		
		obj.pop();
		System.out.println("The elements inside the stack are: "+obj);
		

	}

}
