// Q12. Alphabet Triangle Pattern

class Q12AlphabetTrianglePattern {
    public static void main(String[] args) {

        for(char i = 'A'; i <= 'E'; i++) {

            for(char j = 'A'; j <= i; j++) {
                System.out.print(j + " ");
            }

        }

    }
}

/*
Expected Output:
A A B A B C A B C D A B C D E
*/
