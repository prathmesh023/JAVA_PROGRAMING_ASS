// Create a class Circle with radius
// and method calculateArea().

class Circle {

    double radius = 5;

    void calculateArea() {

        double area = 3.14 * radius * radius;

        System.out.println("Area: " + area);
    }
}

public class CircleMain {
    public static void main(String[] args) {

        Circle c1 = new Circle();

        c1.calculateArea();
    }
}

/*
Output:
Area: 78.5
*/