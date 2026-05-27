// Q46. Frequency of Elements in Array

class Q46FrequencyOfElements {
    public static void main(String[] args) {

        int arr[] = {1, 2, 2, 3, 3, 3, 4};
        boolean visited[] = new boolean[arr.length];

        for(int i = 0; i < arr.length; i++) {

            if(visited[i]) {
                continue;
            }

            int count = 1;

            for(int j = i + 1; j < arr.length; j++) {

                if(arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println("Element " + arr[i] + ": " + count + " time(s)");
        }

    }
}

/*
Expected Output:
Element 1: 1 time(s)
Element 2: 2 time(s)
Element 3: 3 time(s)
Element 4: 1 time(s)
*/
