package org.tnsif.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ParameterizedTestDemo {

	@ParameterizedTest
	@ValueSource(strings= {"Nia", "Diya"})
	void test() {
		System.out.println("Hello");
	}
	
	@ParameterizedTest
	@ValueSource(strings= {"Nia", "Diya"})
	void display(String str) {
		assertNotNull(str);
	}
}
