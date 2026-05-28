// Write a program to copy one array into another array.

public class Array9 {
    public static void main(String[] args) {

        int arr1[] = {1,2,3,4,5};
        int arr2[] = new int[arr1.length];

        for(int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }

        System.out.println("Array copied successfully");
    }
}

/*
Output:
Array copied successfully
*/