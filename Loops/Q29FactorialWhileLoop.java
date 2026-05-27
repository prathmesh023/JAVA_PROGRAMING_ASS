// Q29. Factorial Using While Loop

class Q29FactorialWhileLoop {
    public static void main(String[] args) {

        int number = 5;
        int factorial = 1;
        int i = 1;

        while(i <= number) {
            factorial = factorial * i;
            i++;
        }

        System.out.println("Factorial of " + number + " is " + factorial);

    }
}

/*
Expected Output:
Factorial of 5 is 120
*/
