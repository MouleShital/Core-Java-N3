package org.tnsif.queuedemo;

import java.util.PriorityQueue;
import java.util.Queue;

//program to demonstrate on priority queue
public class PriorityQueueDemo {

	public static void main(String[] args) {
		Queue<Integer> obj = new PriorityQueue<>();
		//add and offer method is used to insert an element
		obj.offer(3);	
		obj.add(55);
		obj.add(91);
		obj.add(15);
		System.out.println("Queue elements are: "+obj);
		obj.remove();	//to remove the element that have inserted first
		/*obj.remove();
		obj.remove();
		obj.remove();
		obj.remove();*/
		System.out.println("queue elements are: "+obj);
		
		obj.poll();		//to remove the element that have inserted first
		/*obj.poll();
		obj.poll();
		obj.poll();
		obj.poll();*/
		System.out.println("queue elements are: "+obj);
		
		System.out.println("Queue elements are: "+obj.peek());
		System.out.println("Queue elements are: "+obj.element());
		

	}

}
