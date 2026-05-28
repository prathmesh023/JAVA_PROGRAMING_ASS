// Write a program to insert an element into an array.

public class Array18 {
    public static void main(String[] args) {

        int arr[] = {10,20,30,40};
        int element = 25;
        int position = 2;

        int newArr[] = new int[arr.length + 1];

        for(int i = 0; i < position - 1; i++) {
            newArr[i] = arr[i];
        }

        newArr[position - 1] = element;

        for(int i = position; i < newArr.length; i++) {
            newArr[i] = arr[i - 1];
        }

        for(int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}

/*
Output:
10 25 20 30 40
*/