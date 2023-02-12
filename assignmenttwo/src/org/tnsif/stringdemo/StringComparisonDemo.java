package org.tnsif.stringdemo;
//program to demonstrate a string comparison
public class StringComparisonDemo {

	public static void main(String[] args) {
		//creating a string using literals
		String s1 = "TNSIF";
		String s2 = "TNSIF";
		
		//creating a string using new operator
		String s3 = new String("TNSIF");
		String s4 = new String("TNSIF");
		
		//string comparison
		System.out.println(s1==s2);
		System.out.println(s3==s4);
		System.out.println(s1.equals(s4));
		
		System.out.println(s1.compareTo("tnsif"));
		System.out.println(s1.compareToIgnoreCase("tnsif"));
		System.out.println(s1.compareTo(s2));
	}

}
