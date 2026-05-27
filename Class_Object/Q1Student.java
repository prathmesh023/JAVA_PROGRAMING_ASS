// Q1. Student Class Example

class Student {
    String name;
    int age;
    char grade;

    public static void main(String[] args) {

        Student s = new Student();

        s.name = "John";
        s.age = 20;
        s.grade = 'A';

        System.out.println("Name: " + s.name);
        System.out.println("Age: " + s.age);
        System.out.println("Grade: " + s.grade);
    }
}

/*
Expected Output:
Name: John
Age: 20
Grade: A
*/
