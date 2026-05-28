// Write a program to merge two arrays.

public class Array14 {
    public static void main(String[] args) {

        int arr1[] = {1,2,3};
        int arr2[] = {4,5,6};

        int merge[] = new int[arr1.length + arr2.length];

        int index = 0;

        for(int i = 0; i < arr1.length; i++) {
            merge[index++] = arr1[i];
        }

        for(int i = 0; i < arr2.length; i++) {
            merge[index++] = arr2[i];
        }

        for(int i = 0; i < merge.length; i++) {
            System.out.print(merge[i] + " ");
        }
    }
}

/*
Output:
1 2 3 4 5 6
*/