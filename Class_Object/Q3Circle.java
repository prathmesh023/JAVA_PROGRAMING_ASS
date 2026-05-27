// Q3. Circle Class Example

class Circle {
    double radius;

    double calculateCircumference() {
        return 2 * 3.14 * radius;
    }

    public static void main(String[] args) {

        Circle c = new Circle();

        c.radius = 7;

        System.out.println("Radius: " + c.radius);
        System.out.println("Circumference: " + c.calculateCircumference());
    }
}

/*
Expected Output:
Radius: 7
Circumference: 43.96
*/
