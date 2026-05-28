// Write a program to print array elements in ascending order.

public class Array10 {
    public static void main(String[] args) {

        int arr[] = {5,2,1,4,3};

        for(int i = 0; i < arr.length; i++) {

            for(int j = i + 1; j < arr.length; j++) {

                if(arr[i] > arr[j]) {

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

/*
Output:
1 2 3 4 5
*/