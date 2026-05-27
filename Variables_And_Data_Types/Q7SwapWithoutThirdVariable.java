// Q7. Swap Two Variables Without Third Variable

class Q7SwapWithoutThirdVariable {
    public static void main(String[] args) {

        int a = 5;
        int b = 3;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping: a = " + a + ", b = " + b);

    }
}

/*
Expected Output:
After swapping: a = 3, b = 5
*/
