// Create a class Mobile with properties brand, model, and price.
// Display mobile details using object.
import java.util.*;
class Mobile {

    String brand;
    String model;
    int price;
}

public class MobileInfo {
    public static void main(String[] args) {

        Mobile m1 = new Mobile();

        m1.brand = "Samsung";
        m1.model = "S23";
        m1.price = 75000;

        System.out.println("Brand: " + m1.brand +
                           " Model: " + m1.model +
                           " Price: " + m1.price);
    }
}

/*
Output:
Brand: Samsung Model: S23 Price: 75000
*/