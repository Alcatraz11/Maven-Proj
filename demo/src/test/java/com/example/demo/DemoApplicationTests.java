package com.example.demo;

import java.util.HashSet;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class DemoApplicationTests {

	@Test
	void junitTestWithNeitherMethod() {
		EmployeeWithoutOverriding emp1 = new EmployeeWithoutOverriding(1, "Aman", "Pongle");
		EmployeeWithoutOverriding emp2 = new EmployeeWithoutOverriding(1, "Aman", "Pongle");
		HashSet<EmployeeWithoutOverriding> empSet = new HashSet<>();
		empSet.add(emp1);
		empSet.add(emp2);
		for(EmployeeWithoutOverriding emp: empSet)
		{
			System.out.println(emp.firstname);
		}
	}

	@Test
	void junitTestWithHashcode() {
		HashSet<Employee2> empSet= new HashSet<>();
		Employee2 emp1 = new Employee2(1, "Aman", "Pongle");
		Employee2 emp2 = new Employee2(1, "Aman", "Pongle");
		empSet.add(emp1);
		empSet.add(emp2);
		for(Employee2 emp: empSet)
		{
			System.out.println(emp.firstname);
		}
	}
	@Test
	void junitTestWithEquals() {
		HashSet<Employee3> empSet= new HashSet<>();
		Employee3 emp1 = new Employee3(1, "Aman", "Pongle");
		Employee3 emp2 = new Employee3(1, "Aman", "Pongle");
		empSet.add(emp1);
		empSet.add(emp2);
		for(Employee3 emp: empSet)
		{
			System.out.println(emp.firstname);
		}
		
	}
	@Test
	void junitTestWithBothMethods() {
		HashSet<Employee> empSet= new HashSet<>();
		HashSetCollection collObj = new HashSetCollection();
		Assert.assertEquals(true, collObj.getSetSize(empSet)==0);
		collObj.addingEmployees(empSet);
		Assert.assertEquals(true, collObj.getSetSize(empSet)==1);
		for(Employee emp: empSet)
		{
			System.out.println(emp.firstname);
		}
	}
}
