// Q37. Sum of Digits

class Q37SumOfDigits {
    public static void main(String[] args) {

        int number = 1234;
        int sum = 0;

        while(number != 0) {
            sum = sum + (number % 10);
            number = number / 10;
        }

        System.out.println("Sum of digits: " + sum);

    }
}

/*
Expected Output:
Sum of digits: 10
*/
