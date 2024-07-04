package com.example.demo;

import java.util.TreeSet;

public class CustomSortTreeset {
    public static void main(String[] args) {
        TreeSet<Employee> ts = new TreeSet<Employee>(new CompareByName());
        ts.add(new Employee(1, "B", "Pongle"));
        ts.add(new Employee(2, "C", "Singh"));
        ts.add(new Employee(3, "A", "Janab"));

        for(Employee ele: ts)
        {
            System.out.println(ele.firstname+" "+ele.lastname);
        }
    }
}
