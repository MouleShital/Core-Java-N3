package org.tnsif.junit;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

//program to demonstrate on first junit5 testing
public class FirstJavaProgramTesting {
	
	@Test
	@DisplayName("SimpleJunitTestingMethod")
	void test() {
		System.out.println("First Junit Test Case");
	}
	
	@Test
	void display() {
		System.out.println("Welcome to C2TC");
	}
}
