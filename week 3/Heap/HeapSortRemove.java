import java.util.Arrays;

public class HeapSortRemove {
    public static void main(String[] args) {
        int[] arr = { 3, 6, 2, 7, 9,0,0, 6, 1, 4, 5, 8, 5 };

        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void heapSort(int[] arr) {
        int n = arr.length;
 
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        for (int i = n - 1; i >= 0; i--) {

            swap(arr, i, 0);
            heapify(arr, i, 0);
        }

        // remove duplicates
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }
        Arrays.fill(arr, j + 1, arr.length, 0);
    }

    public static void swap(int arr[], int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    public static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != i) {
            swap(arr, largest, i);
            heapify(arr, n, largest);
        }
    }
}
