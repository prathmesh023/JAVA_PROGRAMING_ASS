// Write a program to find the second largest element in an array.

public class Array12 {
    public static void main(String[] args) {

        int arr[] = {10,20,30,40,50};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }

        System.out.println("Second Largest = " + secondLargest);
    }
}

/*
Output:
Second Largest = 40
*/