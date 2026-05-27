// Q31. Sum of Odd Numbers

class Q31SumOddNumbers {
    public static void main(String[] args) {

        int sum = 0;
        int i = 1;

        while(i <= 100) {
            sum = sum + i;
            i = i + 2;
        }

        System.out.println("Sum of odd numbers: " + sum);

    }
}

/*
Expected Output:
Sum of odd numbers: 2500
*/
