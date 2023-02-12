package org.tnsif.staticdemo;

class StaticMethodExec{
	//data member 
	private static double salary = 4500.67;
	
	//static method
	public static void display()
	{
		System.out.println("Salary is:"+salary);
	}
	
	//getters and setters method
	public static double getSalary() {
		return salary;
	}

	public static void setSalary(double salary) {
		StaticMethodExec.salary = salary;
	}
}
public class StaticMethodExecuter {

	public static void main(String[] args) {
		StaticMethodExec.display();

	}

}
