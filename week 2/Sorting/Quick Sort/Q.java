import java.util.Arrays;

public class Q {

    private static void quickSort(int[] arr, int i, int j) {

        if (j > i) {
            int loc = partition(arr, i, j);
            quickSort(arr, i, loc - 1);
            quickSort(arr, loc + 1, j);
        }

    }

    private static int partition(int[] arr, int i, int j) {

        int pivot = arr[i];
        int start = i;
        int end = j;

        while (start < end) {

            while (pivot > arr[start]) {
                start++;
            }
            while (arr[end] > pivot) {
                end--;
            }

            if (end > start) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

            }

        }

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        return end;

    }

    public static void main(String[] args) {

        int[] arr = { 1, 3, 6, 2, 4, 12, 34, 89 };

        quickSort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }

}
