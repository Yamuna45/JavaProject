package com.demo.GitProject;

public class Employee1 {
	int id;
	String name;
	Double salary;
	public Employee1(int id,String nm,double sal) {
		this.id=id;
		this.name=nm;
		this.salary=sal;
	}
	public static void main(String[] args) {
		Employee1 e1=new Employee1(101,"abc",1500);
		System.out.println("Employee Id is:"+e1.getid());

	}

}
