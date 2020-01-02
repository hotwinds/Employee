package com.matricon.employee;

//import oracle.jdbc.OracleConnection;
import java.sql.Connection;
import java.sql.DriverManager;


public class OracleConnection {

    public static Connection getConnect () {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe", "matricon", "Rovaniemi");
            return conn;
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }
}
