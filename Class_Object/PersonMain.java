// Create a class Person with name and age.
// Create two objects and display details.

class Person {

    String name;
    int age;

    void display() {

        System.out.println("Name: " + name +
                           " Age: " + age);
    }
}

public class PersonMain {
    public static void main(String[] args) {

        Person p1 = new Person();
        Person p2 = new Person();

        p1.name = "Amit";
        p1.age = 22;

        p2.name = "Priya";
        p2.age = 21;

        p1.display();
        p2.display();
    }
}

/*
Output:
Name: Amit Age: 22
Name: Priya Age: 21
*/