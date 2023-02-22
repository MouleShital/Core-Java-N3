package org.tnsif.queuedemo;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		Deque<String> obj = new ArrayDeque<>();
		obj.add("Vaibhav");
		obj.addFirst("Vrush");
		obj.addLast("Saurav");
		obj.offer("ABC");
		System.out.println("Array Deque Elements are:" +obj);
		
		//to extract the elements from a queue
		for(String itr:obj)
		{
			System.out.print(itr+" ");
		}
		
		obj.removeFirst();
		System.out.println("\nArray Deque Elements are:" +obj);
		
		obj.removeLast();
		System.out.println("Array Deque Elements are:" +obj);
		
		obj.remove();
		System.out.println("Array Deque Elements are: "+obj);
	}

}
