package com.matricon.employee;

import oracle.jdbc.OracleConnection;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws Exception {
        EmployeeManager ne = new EmployeeManager();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = 0;
        while (x < 7) {
            ne.MainMenu();
            String sa = reader.readLine();
            x = Integer.parseInt(sa);
            switch (x) {
                case 1:
                    ne.SetEmployee();
                    break;
                case 2:
                    ne.PrintEmployee();
                    break;
                case 3:
                    ne.EditEmployee();
                    break;
                case 4:
                    ne.ExportToFile();
                    break;
                case 5:
                    ne.ImportEmployee();
//                    Class.forName("oracle.jdbc.driver.OracleDriver");
//                    Connection con = DriverManager.getConnection(
//                            "jdbc:oracle:thin:@localhost:1521:xe", "ASUKHOVEEV@YAHOO.COM", "Rovaniemi");
//
//                    Statement st = conn.createStatement();
//
//                    ResultSet rs = st.executeQuery("select * from EmployeeTable");
//                    while(rs.next())
//                    {
//                        System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getInt(3) +
//                                " " + rs.getInt(4) + " " + rs.getString(5) + " " + rs.getInt(6));
//                    }
//
//                    rs.close();
//                    st.close();
//                    conn.close();

                    //System.out.println("5. Import employee");
                    break;
                case 6:
                    ne.SearchEmployee();
                    break;
                case 7:
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + x);
            }
        }
    }
}
