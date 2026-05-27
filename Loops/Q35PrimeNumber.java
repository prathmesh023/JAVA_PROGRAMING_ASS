// Q35. Prime Number Check

class Q35PrimeNumber {
    public static void main(String[] args) {

        int number = 29;
        boolean isPrime = true;

        for(int i = 2; i <= number / 2; i++) {
            if(number % i == 0) {
                isPrime = false;
                break;
            }
        }

        if(isPrime) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }

    }
}

/*
Expected Output:
29 is a prime number
*/
