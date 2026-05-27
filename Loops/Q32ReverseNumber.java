// Q32. Reverse a Number

class Q32ReverseNumber {
    public static void main(String[] args) {

        int number = 12345;
        int reverse = 0;

        while(number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }

        System.out.println("Reversed number: " + reverse);

    }
}

/*
Expected Output:
Reversed number: 54321
*/
