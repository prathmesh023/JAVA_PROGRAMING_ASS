// Q5. Car Class Example

class Car {
    String model;
    int year;
    int price;

    public static void main(String[] args) {

        Car c = new Car();

        c.model = "Tesla Model 3";
        c.year = 2020;
        c.price = 35000;

        System.out.println("Model: " + c.model);
        System.out.println("Year: " + c.year);
        System.out.println("Price: " + c.price);
    }
}

/*
Expected Output:
Model: Tesla Model 3
Year: 2020
Price: 35000
*/
