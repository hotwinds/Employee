
public class Main {
            public static void main(String[] args){
            EmployeeManager em1 = new EmployeeManager("Petr", "Ivanov", 21, "man", "Chisinau", 6500);
            EmployeeManager em2 = new EmployeeManager( "Alla", "Petrov",  19, "woman", "Chisinau", 7000);
            EmployeeManager em3 = new EmployeeManager( "Ivan", "Moroz", 18, "man", "Balti", 6500);
            System.out.println(em1);
            System.out.println(em2);
            System.out.println(em3);
            em1.print();
            em2.print();
            em3.print();
    }
}
