// Write a program to separate even and odd elements from an array.

public class Array21 {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6};

        System.out.print("Even: ");

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }

        System.out.println();

        System.out.print("Odd: ");

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}

/*
Output:
Even: 2 4 6
Odd: 1 3 5
*/