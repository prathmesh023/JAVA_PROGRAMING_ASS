// Q14. Reverse Number Pattern

class Q14ReverseNumberPattern {
    public static void main(String[] args) {

        for(int i = 5; i >= 1; i--) {

            for(int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

        }

    }
}

/*
Expected Output:
5 4 3 2 1 4 3 2 1 3 2 1 2 1 1
*/
