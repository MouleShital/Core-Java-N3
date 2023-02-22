package org.tnsif.setdemo;

import java.util.SortedSet;
import java.util.TreeSet;
//program to demonstrate on SortedSet
//TreeSet is used to implement SortedSet
public class SortedSetDemo {

	public static void main(String[] args) {
		SortedSet<String> obj = new TreeSet<>();	//SortedSet declaration
		obj.add("Strawberry");
		obj.add("PineApple");
		obj.add("Cherry");
		obj.add("Apple");
		System.out.println(obj);
	}

}
