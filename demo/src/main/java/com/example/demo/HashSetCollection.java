package com.example.demo;

import java.util.HashSet;
import java.util.Set;
 
public class HashSetCollection {
     
    public int addingEmployees(Set empSet) 
    {
        Employee emp1 = new Employee(1, "Aman", "Pongle");
		Employee emp2 = new Employee(1, "Aman", "Pongle");
        empSet.add(emp1);
        empSet.add(emp2);
        return empSet.size();
    }
    public int getSetSize(HashSet empSet) {
        return empSet.size();
    }
     
    public String getEmpName(HashSet empSet,Employee employee) {
        if (empSet.contains(employee)) {
            return employee.firstname;            
        }
        return null;
    }
}