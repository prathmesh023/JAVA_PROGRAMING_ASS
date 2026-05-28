// Write a program to search an element using linear search.

public class Array7 {
    public static void main(String[] args) {

        int arr[] = {10,20,30,40};
        int key = 30;

        boolean found = false;

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] == key) {
                found = true;
                break;
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