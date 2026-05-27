// Q44. Common Elements Between Arrays

class Q44CommonElements {
    public static void main(String[] args) {

        int arr1[] = {1, 2, 3, 4};
        int arr2[] = {3, 4, 5, 6};

        System.out.print("Common elements: {");

        boolean first = true;

        for(int i = 0; i < arr1.length; i++) {

            for(int j = 0; j < arr2.length; j++) {

                if(arr1[i] == arr2[j]) {

                    if(!first) {
                        System.out.print(", ");
                    }

                    System.out.print(arr1[i]);
                    first = false;
                }
            }
        }

        System.out.println("}");

    }
}

/*
Expected Output:
Common elements: {3, 4}
*/
