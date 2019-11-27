import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
            public static void main(String[] args) throws Exception {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Choose option:");
                System.out.println("1. Add employees");
                System.out.println("2. List employees");
                System.out.println("3. Edit employee");
                System.out.println("4. Export employee");
                System.out.println("5. Export employee");
                System.out.println("6. Search employees");
                String sa = reader.readLine();
                int x = Integer.parseInt(sa);
                switch(x){
                    case 1:
                        System.out.println("1. Add employees");
                        break;
                    case 2:
                        System.out.println("2. List employees");
                        break;
                    case 3:
                        System.out.println("3. Edit employee");
                        break;
                    case 4:
                        System.out.println("4. Export employee");
                        break;
                    case 5:
                        System.out.println("5. Export employee");
                        break;
                    case 6:
                        System.out.println("6. Search employees");
                        break;
                }
            Employee em1 = new Employee("Petr", "Ivanov", 21, "man", "Chisinau", 6500);
            Employee em2 = new Employee( "Alla", "Petrov",  19, "woman", "Chisinau", 7000);
            Employee em3 = new Employee( "Ivan", "Moroz", 18, "man", "Balti", 6500);
            System.out.println(em1);
            System.out.println(em2);
            System.out.println(em3);
            em1.print();
            em2.print();
            em3.print();
            ArrayList<Object> empl = new ArrayList<>();
            empl.add(em1);
            empl.add(em2);
            empl.add(em3);
                for (Object em : empl) {
                    System.out.println(em);
                }
    }
}
