package com.Labee.learnOop;

public class Employee {
	public String firstname;
	public String lastname;
	public String position;
	private int salary;
	
	public Employee(String firstnameInput,String lastnameInput,String positionInput,int salaryInput) {
		firstname = firstnameInput;
		lastname = lastnameInput;
		position = positionInput;
		salary = salaryInput;
		
	}
	public void hello () {
		System.out.println("Hello"+firstname);
	}
	public void  checkposition() {
		System.out.println("position:"+position);
	}
	
	public int getSalary() {
		return salary;
	}
	
}
