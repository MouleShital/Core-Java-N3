package org.tnsif.stringdemo;
//program to demonstrate on different string operations
public class StringOperationDemo {

	public static void main(String[] args) {
		String s1 = new String("Bhujbal");
		String s2 = s1.toUpperCase();	//convert string to uppercase
		System.out.println(s1 +" "+ s2);
		String s3 = s1.toLowerCase();	//convert string to lowercase
		System.out.println(s1 +" "+ s3);
		System.out.println(s1.length());	//count the number of letters in string
		System.out.println(s1.substring(4, 7));
		System.out.println(s1.isEmpty());
	}

}
