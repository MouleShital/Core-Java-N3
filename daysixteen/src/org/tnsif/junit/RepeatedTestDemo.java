package org.tnsif.junit;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class RepeatedTestDemo {

//	@Test
	@RepeatedTest(5)
	void test() {
		System.out.println("Repeated Test Annotation");
	}
}
