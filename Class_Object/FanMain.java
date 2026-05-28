// Create a class Fan with properties company and speed.
// Display fan details.

class Fan {

    String company;
    int speed;
}

public class FanMain {
    public static void main(String[] args) {

        Fan f1 = new Fan();

        f1.company = "Crompton";
        f1.speed = 5;

        System.out.println("Company: " + f1.company +
                           " Speed: " + f1.speed);
    }
}

/*
Output:
Company: Crompton Speed: 5
*/