// Write a program to perform binary search in an array.

public class Array23 {
    public static void main(String[] args) {

        int arr[] = {10,20,30,40,50};

        int key = 40;

        int start = 0;
        int end = arr.length - 1;

        boolean found = false;

        while(start <= end) {

            int mid = (start + end) / 2;

            if(arr[mid] == key) {
                found = true;
                break;
            }
            else if(arr[mid] < key) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        if(found) {
            System.out.println("Element Found");
        } else {
            System.out.println("Element Not Found");
        }
    }
}

/*
Output:
Element Found
*/