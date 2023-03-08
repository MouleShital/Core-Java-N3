package org.tnsif.junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

//program to demonstrate on assertion annotations
public class JunitAssertionDemo {

	@Test
	void test() {
		//Fails when excepted does not equal actual
		assertEquals(12,12);
	}

	@Test
	void display() {
		//Fails when expression is True
		assertFalse(12==1);
	}
}
