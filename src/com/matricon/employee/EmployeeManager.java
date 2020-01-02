package com.matricon.employee;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.util.ArrayList;

import java.util.Set;
import java.util.HashSet;

public class EmployeeManager implements EmployeeInterface {

    //static Set <Employee> EmployeeArrayList = new HashSet<>();
    //static ArrayList<Employee> EmployeeArrayList = new ArrayList<>();

    public void MainMenu() {
        System.out.println("Choose option:");
        System.out.println("1. Add employees");
        System.out.println("2. List employees");
        System.out.println("3. Edit employee");
        System.out.println("4. Export employee");
        System.out.println("5. Import employee");
        System.out.println("6. Search employees");
        System.out.println("7. Exit");
    }

    public void SetEmployee() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter quantity of new employees: ");
        String qty = reader.readLine();
        int y = Integer.parseInt(qty);
        for (int i = 0; i < y; i++) {
            Employee newEmployee = new Employee();
//            newEmployee.setName();
//            newEmployee.setSurname();
//            newEmployee.setAge();
//            newEmployee.setSex();
//            newEmployee.setAddress();
//            newEmployee.setSalary();
//            EmployeeArrayList.add(newEmployee);
            newEmployee.addToDataBase();
        }
    }

    public void PrintEmployee() throws Exception {
        PostgresConnection con = new PostgresConnection();
        con.connect();
        con.print();
//        for (Employee empl : EmployeeArrayList)
//            System.out.println(empl);
    }

    public void EditEmployee() throws Exception {
        PostgresConnection con = new PostgresConnection();
        con.connect();
        con.editInfoInDataBase();
        //con.print();
    }

    public void ImportEmployee() throws Exception {
        PostgresConnection con = new PostgresConnection();
        con.connect();
        con.infoFromDataBase();
        for (Employee empl : EmployeeArrayList)
            System.out.println(empl);
    }

    public void ExportToFile() throws Exception {
        File txtFile = FileExport.createTextFileAbsolute();
        FileWriter writer = new FileWriter(txtFile);
        writer.write("Name  " + "Surname " + "Age    " + "Sex    " + "Address " + "Salary " + "\n");
        for (int i = 0; i < EmployeeArrayList.size(); i++) {
            writer.write("\n" +
                    EmployeeArrayList.get(i).getName() + " " +
                    EmployeeArrayList.get(i).getSurname() + " " +
                    EmployeeArrayList.get(i).getAge() + " " +
                    EmployeeArrayList.get(i).getSex() + " " +
                    EmployeeArrayList.get(i).getAddress() + " " +
                    EmployeeArrayList.get(i).getSalary() + "\n");
            writer.append("\n");
        }
        writer.close();
    }

    public void SearchEmployee() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter searched parameter: ");
        String search = reader.readLine();
        for (int i = 0; i < EmployeeArrayList.size(); i++) {
            if (EmployeeArrayList.get(i).getName().equals(search) ||
                    EmployeeArrayList.get(i).getSurname().equals(search) ||
                    EmployeeArrayList.get(i).getAge().equals(Integer.parseInt(search)) ||
                    EmployeeArrayList.get(i).getSex().equals(search) ||
                    //EmployeeArrayList.get(i).getSex().equals(Gender.Male) ||
                    //EmployeeArrayList.get(i).getSex().equals(Gender.Female) ||
                    EmployeeArrayList.get(i).getAddress().equals(search) ||
                    EmployeeArrayList.get(i).getSalary().equals(Double.parseDouble(search)))
                System.out.println("arrayList contains " + search + " " + EmployeeArrayList.get(i));
            else System.out.println("arrayLst doesn't contain " + search);
        }
    }
}
