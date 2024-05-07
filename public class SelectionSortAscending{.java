public class SelectionSortAscending {
    public static void main(String[] args) {
        int[] arr = { 40, 2, 27, -7, 14 };
        // implementing Selection Sort on the created array
        for (int i = 0; i < arr.length - 1; i++) {
            int min_idx = i;
            // finding out the index containing minimum value from i+1 to last index
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            // swapping the minimum index value with the current index value
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        // displaying the elements of the sorted array
        for (int idx = 0; idx < arr.length; idx++) {
            System.out.println(arr[idx]);
        }
    }
}