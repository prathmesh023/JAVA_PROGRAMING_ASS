// Write a program to reverse an array.

public class Array8 {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5};

        for(int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}

/*
Output:
5 4 3 2 1
*/