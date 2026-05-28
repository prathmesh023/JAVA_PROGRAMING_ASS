// Create a class Employee with properties id, name, and salary.
// Create an object and display employee details.
import java.util.*;

class Employee {

    int id;
    String name;
    double salary;
}

public class Employee1 {
    public static void main(String[] args) {

        Employee e1 = new Employee();

        e1.id = 101;
        e1.name = "Rahul";
        e1.salary = 25000;

        System.out.println("ID: " + e1.id +
                           " Name: " + e1.name +
                           " Salary: " + e1.salary);
    }
}

/*
Output:
ID: 101 Name: Rahul Salary: 25000.0
*/