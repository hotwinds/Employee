package com.matricon.employee;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PostgresConnection implements EmployeeInterface {
    private final String url = "jdbc:postgresql://127.0.0.1/postgres";
    private final String user = "postgres";
    private final String password = "postgres";

    Connection conn = null;

    public Connection connect() throws Exception {
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public void print() throws Exception {
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select * from \"EmployeeList\"");
        System.out.println("Name" + " " + "Surname" + " " + "Age" + " " + "Sex" + " " + "Address" + " " + "Salary");
        while (rs.next()) {
            System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getInt(3) +
                    " " + rs.getString(4) + " " + rs.getString(5) + " " + rs.getInt(6));
        }
        rs.close();
        st.close();
        conn.close();
    }

    public void editInfoInDataBase() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter name of employee for deleting from database: ");
        String name = reader.readLine();
        String query = "delete from \"EmployeeList\" where \"Name\" = ?";
        PreparedStatement pst = conn.prepareStatement(query);
        pst.setString(1, name);
        pst.executeUpdate();
        pst.close();
        conn.close();
    }

    public void infoFromDataBase() throws Exception {
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select * from \"EmployeeList\"");
        while (rs.next()) {
            Employee newEmployee = new Employee(
                    rs.getString(1), rs.getString(2),
                    rs.getInt(3), Gender.valueOf(rs.getString(4)),
                    rs.getString(5), rs.getDouble(6));
            EmployeeArrayList.add(newEmployee);
        }
        rs.close();
        st.close();
        conn.close();
    }

    public void infoToDataBase() throws Exception {
        Employee newEmployee = new Employee();
        String name = newEmployee.setName();
        String surname = newEmployee.setSurname();
        int age = newEmployee.setAge();
        Gender sex = newEmployee.setSex();
        String address = newEmployee.setAddress();
        Double salary = newEmployee.setSalary();

        String query = "insert into \"EmployeeList\" values (?, ?, ?, ?, ?, ?)";
        PreparedStatement pst = conn.prepareStatement(query);
        pst.setString(1, name);
        pst.setString(2, surname);
        pst.setInt(3, age);
        pst.setString(4, sex.toString());
        pst.setString(5, address);
        pst.setDouble(6, salary);
        pst.executeUpdate();

        pst.close();
        conn.close();
    }
}
