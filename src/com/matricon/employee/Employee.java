package com.matricon.employee;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Employee {
    private String name, surname, address;
    private Gender sex;
    private int age;
    private double salary;

    public Employee() {
    }

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Employee(String name, String surname, int age) {
        this(name, surname);
        this.age = age;
    }

    public Employee(String name, String surname, int age, Gender sex) {
        this(name, surname, age);
        this.sex = sex;
    }

    public Employee(String name, String surname, int age, Gender sex, String address) {
        this(name, surname, age, sex);
        this.address = address;
    }

    public Employee(String name, String surname, int age, Gender sex, String address, double salary) {
        this(name, surname, age, sex, address);
        this.salary = salary;
    }

    void print() {
        System.out.printf("name: %s \nsurname: %s \nage: %s \nsex: %s\naddress: %s \nsalary: %s  \n\n",
                name, surname, age, sex, address, salary);
    }

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public String setName() throws Exception {
        System.out.println("Enter name of employee: ");
        this.name = reader.readLine();
        return name;
    }

    public String setSurname() throws Exception {
        System.out.println("Enter surname of employee: ");
        this.surname = reader.readLine();
        return surname;
    }

    public Integer setAge() throws Exception {
        System.out.println("Enter age of employee: ");
        String a = reader.readLine();
        this.age = Integer.parseInt(a);
        return age;
    }

    public Gender setSex() throws Exception {
        System.out.println("Enter sex of employee: ");
        String sx = reader.readLine();
        this.sex = Gender.valueOf(sx);
        return sex;
    }

    public String setAddress() throws Exception {
        System.out.println("Enter address of employee: ");
        this.address = reader.readLine();
        return address;
    }

    public Double setSalary() throws Exception {
        System.out.println("Enter salary of employee: ");
        String s = reader.readLine();
        this.salary = Double.parseDouble(s);
        return salary;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getAge() {
        return age;
    }

    public Gender getSex() {
        return sex;
    }

    public String getAddress() {
        return address;
    }

    public Double getSalary() {
        return salary;
    }

    public void addToDataBase() throws Exception{
        PostgresConnection con = new PostgresConnection();
        con.connect();
        con.infoToDataBase();
    }

    @Override
    public String toString() {
        return "name = " + name + "; surname = " + surname +
                "; age = " + age + "; sex = " + sex + "; address = " + address + "; salary = " + salary;
    }

    @Override
    public boolean equals(Object obj) {
        boolean result = false;
        if (obj instanceof Employee) {
            Employee otherObj = (Employee) obj;
            boolean nameEquals = this.name.equals(otherObj.name);
            boolean surnameEquals = this.surname.equals(otherObj.surname);
            boolean sexEquals = this.sex.equals(otherObj.sex);
            boolean addressEquals = this.address.equals(otherObj.address);
            boolean ageEquals = this.age == otherObj.age;
            boolean salaryEquals = this.salary == otherObj.salary;
            result = nameEquals || surnameEquals || sexEquals || addressEquals || ageEquals || salaryEquals;
        }
        return result;
    }


}
