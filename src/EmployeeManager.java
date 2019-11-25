//interface Employee;

public class EmployeeManager {
    String name;
    String surname;
    int age;
    String sex;
    String address;
    double salary;

    public EmployeeManager(String n, String sn, int a, String s, String ad, double sal){
        this.name = n;
        this.surname = sn;
        this.age=a;
        this.sex=s;
        this.address = ad;
        this.salary = sal;
    }

    void print(){
        System.out.printf("name: %s \nsurname: %s \nage: %s \nsex: %s\naddress: %s \nsalary: %s  \n\n",
                name,surname,age,sex,address,salary);
    }

    public String toString() {return "name = " + name + "; surname = " + surname +
           "; age = " + age + "; sex = " + sex + "; address = " + address + "; salary = " + salary;
	}
}
