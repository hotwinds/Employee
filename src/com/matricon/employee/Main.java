package com.matricon.employee;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.FileWriter;
import java.util.AbstractCollection;


public class Main {
            public static void main(String[] args) throws Exception {
                ArrayList <Employee> EmployeeManager = new ArrayList <>();
//                Employee newEmployee = new Employee();
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                int x = 0;
                while(x < 7) {
                    loop:
                    System.out.println("Choose option:");
                    System.out.println("1. Add employees");
                    System.out.println("2. List employees");
                    System.out.println("3. Edit employee");
                    System.out.println("4. Export employee");
                    System.out.println("5. Import employee");
                    System.out.println("6. Search employees");
                    System.out.println("7. Exit");
                    String sa = reader.readLine();
                    x = Integer.parseInt(sa);
                    switch (x) {
                        case 1:
                            System.out.println("Enter quantity of new employees: ");
                            String qty = reader.readLine();
                            int y = Integer.parseInt(qty);
                            for (int i = 0; i < y; i++) {
                                Employee newEmployee = new Employee();
                                newEmployee.setName();
                                newEmployee.setSurname();
                                newEmployee.setAge();
                                newEmployee.setSex();
                                newEmployee.setAddress();
                                newEmployee.setSalary();
                                EmployeeManager.add(newEmployee);
                            }
                            for (Object empl : EmployeeManager) {
                                System.out.println(empl);
                            }
                            break;
                        case 2:
                            for (Object empl : EmployeeManager) {
                                System.out.println(empl);
                            }
                            break;
                        case 3:
                            System.out.println("3. Edit employee");
                            break;
                        case 4:
                            File txtFile = FileExport.createTextFileAbsolute();
                            FileWriter writer = new FileWriter(txtFile);
                            for(int i=0; i<EmployeeManager.size(); i++) {
                            writer.write(Employee.getName() + " " +
                                    Employee.getSurname() + " " +
                                    Employee.getAge() + " " +
                                    Employee.getSex() + " " +
                                    Employee.getAddress() + " " +
                                    Employee.getSalary() );
                            }
                            writer.close();

                            //System.out.println("4. Export employee");
                            break;
                        case 5:
                            System.out.println("5. Import employee");
                            break;
                        case 6:
                            System.out.println("Enter searched parameter: ");
                            String search = reader.readLine();
                            for(int i=0; i<EmployeeManager.size(); i++)
                            {
                                    if(Employee.getName().equals(search) ||
                                            Employee.getSurname().equals(search) ||
                                            Employee.getAge() == search ||
                                            Employee.getSex().equals(search) ||
                                            Employee.getAddress().equals(search) ||
                                            Employee.getSalary() == search)
                                    System.out.println("arrayList contains " + search);
                                else System.out.println("arraylist doesn't contain " + search);
                            }
                            break;
                        case 7:
                            break;
                        default:
                            throw new IllegalStateException("Unexpected value: " + x);
                    }
                }
//            Employee em1 = new Employee("Petr", "Ivanov", 21, "man", "Chisinau", 6500);
//            Employee em2 = new Employee( "Alla", "Petrov",  19, "woman", "Chisinau", 7000);
//            Employee em3 = new Employee( "Ivan", "Moroz", 18, "man", "Balti", 6500);
//            System.out.println(em1);
//            System.out.println(em2);
//            System.out.println(em3);
//            em1.print();
//            em2.print();
//            em3.print();
            }
}
