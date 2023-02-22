package org.tnsif.setdemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
//program to demonstrate on set-->1)HashSet and 2)LinkedHashSet
public class SetDemo {

	public static void main(String[] args) {
		//set 1
		//HashSet will print the elements in unordered wise
		Set<Object> obj1 = new HashSet<>();
		obj1.add(11);
		obj1.add("Naina");
		obj1.add(87.90f);
		System.out.println("Set Elements are: "+obj1);
		
		//LinkedHashSet will print the elements in ordered wise
		//set 2
		Set<Object> obj2 = new LinkedHashSet<>();
		obj2.add(11);
		obj2.add("Naina");
		obj2.add(87.90f);
		System.out.println("Set Elements are: "+obj2);
	}

}
