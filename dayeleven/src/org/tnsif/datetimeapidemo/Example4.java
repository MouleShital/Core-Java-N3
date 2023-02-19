package org.tnsif.datetimeapidemo;

import java.time.Clock;
import java.time.Instant;

public class Example4 {

	public static void main(String[] args) {
		Clock c = Clock.systemUTC();
		System.out.println(c);
		
		Clock c1 = Clock.systemDefaultZone();
		System.out.println(c1);
		
		Instant i = Instant.now();
		System.out.println(i);
		
	}

}
