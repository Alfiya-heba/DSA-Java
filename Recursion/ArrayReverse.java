public class ArrayReverse {
    private static void printArray(int arr[], int n) {
        System.out.println("Reversed Array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static void reverseArr(int arr[], int start, int end) {
        if (start< end) { 
        // Swap elements
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        // Recursive call
        reverseArr(arr, start + 1, end - 1);
    }
}

    public static void main(String[] args) {
        int n = 5;
        int arr[] = {1, 2, 3, 4, 5};
        reverseArr(arr, 0, n - 1);
        printArray(arr, n);
    }
}
