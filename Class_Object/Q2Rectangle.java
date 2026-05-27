// Q2. Rectangle Class Example

class Rectangle {
    int length;
    int width;

    int calculateArea() {
        return length * width;
    }

    public static void main(String[] args) {

        Rectangle r = new Rectangle();

        r.length = 5;
        r.width = 3;

        System.out.println("Length: " + r.length);
        System.out.println("Width: " + r.width);
        System.out.println("Area: " + r.calculateArea());
    }
}

/*
Expected Output:
Length: 5
Width: 3
Area: 15
*/
