//interface Employee;

public class Employee{
    String name, surname, sex, address;
    int age;
    double salary;

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
}
