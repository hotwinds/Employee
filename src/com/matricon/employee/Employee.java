package com.matricon.employee;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Employee{
    String name, surname, sex, address;
    int age;
    double salary;

    public Employee (){}

    public Employee(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public Employee(String name, String surname, int age){
        this(name, surname);
        this.age = age;
    }

    public Employee(String name, String surname, int age, String sex){
        this(name, surname, age);
        this.sex = sex;
    }

    public Employee(String name, String surname, int age, String sex, String address){
        this(name, surname, age, sex);
        this.address = address;
    }

    public Employee(String name, String surname, int age, String sex, String address, double salary){
        this(name, surname, age, sex, address);
        this.salary = salary;
    }

    void print(){
        System.out.printf("name: %s \nsurname: %s \nage: %s \nsex: %s\naddress: %s \nsalary: %s  \n\n",
                name,surname,age,sex,address,salary);
    }

    public String toString() {return "name = " + name + "; surname = " + surname +
           "; age = " + age + "; sex = " + sex + "; address = " + address + "; salary = " + salary;
	}
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public String setname() throws Exception {
        System.out.println("Enter name of employee: ");
        this.name = reader.readLine();
        return name;
    }

    public String setsurname() throws Exception {
        System.out.println("Enter surname of employee: ");
        this.surname = reader.readLine();
        return surname;
    }

    public int setage() throws Exception {
        System.out.println("Enter age of employee: ");
        String a = reader.readLine();
        this.age = Integer.parseInt(a);
        return age;
    }

    public String setsex() throws Exception {
        System.out.println("Enter sex of employee: ");
        this.sex = reader.readLine();
        return sex;
    }

    public String setaddress() throws Exception{
        System.out.println("Enter address of employee: ");
        this.address = reader.readLine();
        return address;
    }

    public double setsalary() throws Exception{
        System.out.println("Enter salary of employee: ");
        String s = reader.readLine();
        this.salary = Double.parseDouble(s);
        return salary;
    }

    public String getname() { return name; }
    public String getsurname() {  return surname; }
    public int getage() { return age; }
    public String getsex() { return sex; }
    public String getaddress() {  return address; }
    public double getsalary() { return salary; }
}
