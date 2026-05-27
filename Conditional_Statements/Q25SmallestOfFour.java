// Q25. Smallest of Four Numbers

class Q25SmallestOfFour {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 5;
        int d = 15;

        int smallest = a;

        if(b < smallest) {
            smallest = b;
        }

        if(c < smallest) {
            smallest = c;
        }

        if(d < smallest) {
            smallest = d;
        }

        System.out.println("Smallest number is " + smallest);

    }
}

/*
Expected Output:
Smallest number is 5
*/
