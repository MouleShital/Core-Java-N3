package org.tnsif.datetimeapidemo;

import java.time.Instant;

public class Example7 {

	public static void main(String[] args) {
		Instant a = Instant.EPOCH;
		System.out.println(a);
		
		Instant a1 = Instant.EPOCH.now();
		System.out.println(a1);
		
		Instant a2 = Instant.EPOCH.MIN;
		System.out.println(a2);
	}

}
