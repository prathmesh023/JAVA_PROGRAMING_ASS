// Create a class Laptop with properties brand and RAM.
// Use constructor to initialize values.

class Laptop {

    String brand;
    String ram;

    Laptop(String brand, String ram) {

        this.brand = brand;
        this.ram = ram;
    }

    void display() {

        System.out.println("Brand: " + brand +
                           " RAM: " + ram);
    }
}

public class LaptopMain {
    public static void main(String[] args) {

        Laptop l1 = new Laptop("HP", "16GB");

        l1.display();
    }
}

/*
Output:
Brand: HP RAM: 16GB
*/