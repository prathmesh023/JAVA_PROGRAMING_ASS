// Write a program to find the second smallest element in an array.

public class Array13 {
    public static void main(String[] args) {

        int arr[] = {10,20,30,40,50};

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            }
            else if(arr[i] < secondSmallest) {
                secondSmallest = arr[i];
            }
        }

        System.out.println("Second Smallest = " + secondSmallest);
    }
}

/*
Output:
Second Smallest = 20
*/