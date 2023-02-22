package org.tnsif.setdemo;

import java.util.LinkedHashSet;
import java.util.Set;
//driver code
//program to demonstrate on a user-defined object
public class StudentSetExecuter {

	public static void addStudent(Set<Student> obj) {
		Student student1 = new Student(11, "A", 60.5f);
		Student student2 = new Student(24, "S", 66.5f);
		Student student3 = new Student(53, "E", 46.5f);
		Student student4 = new Student(23, "L", 45.5f);
		Student student5 = new Student(64, "H", 68.5f);
		obj.add(student1);
		obj.add(student2);
		obj.add(student3);
		obj.add(student4);
		obj.add(student5);
		
		
	}
	public static void main(String[] args) {
		Set<Student> obj = new LinkedHashSet<>();
		addStudent(obj);
		System.out.println(obj);

	}

}
