// Q18. Logical Operators

class Q18LogicalOperators {
    public static void main(String[] args) {

        int number = 12;

        boolean between = (number >= 10 && number <= 20);
        boolean even = (number % 2 == 0);

        System.out.println("Number is between 10 and 20: " + between);
        System.out.println("Number is even: " + even);

    }
}

/*
Expected Output:
Number is between 10 and 20: true
Number is even: true
*/
