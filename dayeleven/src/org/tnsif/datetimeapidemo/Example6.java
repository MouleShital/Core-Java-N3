package org.tnsif.datetimeapidemo;

import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Set;

public class Example6 {

	public static void main(String[] args) {
		LocalTime t = LocalTime.now(ZoneId.of("Asia/Irkutsk"));
		System.out.println(t);
		
		for(String s:ZoneId.getAvailableZoneIds())
		{
			System.out.println(s);
		}
	}

}
