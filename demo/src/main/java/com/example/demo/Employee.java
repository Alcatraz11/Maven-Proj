package com.example.demo;

public class Employee {
    public int id;
    public String firstname;
    public String lastname;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public Employee(int id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Employee) {
            Employee other = (Employee) o;
            return firstname.equals(other.firstname);
        }
 
        return false;
    }
 
    @Override
    public int hashCode() {
        return firstname.hashCode();
    }
}
