package com.example.demo;

import java.util.Set;
import java.util.TreeSet;

//This throws ClassCastException
public class DefaultTreesetSort {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Aman", "Pongle");
        Employee emp2 = new Employee(2, "B", "Singh");
        Employee emp3 = new Employee(3, "C", "Janab");
        Set ts = new TreeSet<Employee>();
        ts.add(emp1);
        ts.add(emp2);
        ts.add(emp3);
        System.out.println(ts);
    }
}
