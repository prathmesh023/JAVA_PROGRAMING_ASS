// 3. Write a program to find the average of array elements.
class Array3_Average {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        int sum = 0;

        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
        }

        int avg = sum / arr.length;

        System.out.println("Average = " + avg);
    }
}

/*
Output:
Average = 30
*/
