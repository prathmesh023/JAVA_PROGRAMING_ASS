// Q12. Alphabet Pattern

class Q12AlphabetPattern {
    public static void main(String[] args) {

        for(char ch = 'A'; ch <= 'E'; ch++) {

            for(char j = 'A'; j <= ch; j++) {
                System.out.print(j + " ");
            }
        }

    }
}

/*
Expected Output:
A A B A B C A B C D A B C D E
*/
