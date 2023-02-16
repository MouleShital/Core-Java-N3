package org.tnsif.arraysdemo;
//to get the class name of the array
//getClass() method is used to get the class
//getName() method is used to print the name of the class
public class ClassNameDemo {

	public static void main(String[] args) {
		//integer
		int[] a = {10, 20, 30};
		System.out.println(a.getClass().getName());
		//float
		float[] b = {10.8f, 20.2f, 30.6f};
		System.out.println(b.getClass().getName());
		//char
		char[] c = {'f', 'a', 'd'};
		System.out.println(c.getClass().getName());
	}

}
