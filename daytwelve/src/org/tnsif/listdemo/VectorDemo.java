package org.tnsif.listdemo;

import java.util.Collections;
import java.util.List;
import java.util.Vector;
//program to demonstrate on vector
public class VectorDemo {

	public static void main(String[] args) {
		List<Object> obj1 = new Vector<>();
		obj1.add(101);
		obj1.add(30.8f);
		obj1.add('z');
		obj1.add(30.8);
		System.out.println("Second List is: "+obj1);

		//Methods
		System.out.println("List size is: "+obj1.size());
		System.out.println("List is empty or not: "+obj1.isEmpty());
		obj1.remove(0);
		System.out.println("First List is:" +obj1);
		System.out.println(obj1.contains(101));
		
		System.out.println("Element at index 1:"+obj1.get(1));
		System.out.println("Index of 'z':"+obj1.indexOf('z'));
		System.out.println("Last index of 30.8f is:"+obj1.lastIndexOf(30.8f));
//		obj1.clear();
//		System.out.println(obj1);
		
		//to extract the elements from the list
		for(Object itr:obj1)
		{
			System.out.print(itr+" ");
		}
		
		
		List<Integer> obj2 = new Vector<>();
		obj2.add(67);
		obj2.add(16);
		obj2.add(45);
		System.out.println("List3 is:"+obj2);
		
		//to sort the list
		Collections.sort(obj2);
		System.out.println("After Sorting in Ascending:"+obj2);
		Collections.reverse(obj2);
		System.out.println("After Sorting in Descending:"+obj2);


	}

}
