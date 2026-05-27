// Q42. Sort Array in Ascending Order

class Q42SortArray {
    public static void main(String[] args) {

        int arr[] = {5, 3, 8, 1, 2};

        for(int i = 0; i < arr.length; i++) {

            for(int j = i + 1; j < arr.length; j++) {

                if(arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.print("Sorted array: {");

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

            if(i < arr.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("}");

    }
}

/*
Expected Output:
Sorted array: {1, 2, 3, 5, 8}
*/
