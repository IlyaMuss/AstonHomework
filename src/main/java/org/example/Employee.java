package org.example;

public class Employee {
    String fullName;
    String position;
    String email;
    String phone;
    double salary;
    int age;

    Employee(String fullName, String position, String email, String phone, double salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    void printEmployeeInfo() {
        System.out.println();
        System.out.println("Employee Information:");
        System.out.println("Full Name: " + fullName);
        System.out.println("Position: " + position);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Salary: " + salary);
        System.out.println("Age: " + age);
    }
}
