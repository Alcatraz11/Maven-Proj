package com.example.demo;

import java.util.HashSet;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class DemoApplicationTests {

	@Test
	void junitTestWithNeitherMethod() {
		Employee emp1 = new Employee(1, "Aman", "Pongle");
		Employee emp2 = new Employee(1, "Aman", "Pongle");
		HashSet<Employee> hs = new HashSet<>();
		hs.add(emp1);
		hs.add(emp2);
	}

	@Test
	void junitTestWithBothMethods() {
		HashSet<Employee> empSet= new HashSet<>();
		HashSetCollection collObj = new HashSetCollection();
		Assert.assertEquals(true, collObj.getSetSize(empSet)==0);
		collObj.addingEmployees(empSet);
		Assert.assertEquals(true, collObj.getSetSize(empSet)==1);
	}
}
