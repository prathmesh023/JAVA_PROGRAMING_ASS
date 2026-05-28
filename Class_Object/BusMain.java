// Create a class Bus with busNumber and route.
// Display bus details using object.

class Bus {

    String busNumber;
    String route;
}

public class BusMain {
    public static void main(String[] args) {

        Bus b1 = new Bus();

        b1.busNumber = "MH12AB1234";
        b1.route = "Pune to Mumbai";

        System.out.println("Bus Number: " + b1.busNumber +
                           " Route: " + b1.route);
    }
}

/*
Output:
Bus Number: MH12AB1234 Route: Pune to Mumbai
*/