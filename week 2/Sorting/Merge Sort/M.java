import java.util.Arrays;

public class M {

    public static void main(String[] args) {

        int[] arr = { 13,12,14 };

        int len = arr.length;

        mergeSort(arr, 0, len - 1);

    }

    private static void mergeSort(int[] arr, int i, int length) {

        if (length - i <= 1) {
            return;
        }

        int mid = (i + length) / 2;
        int low = i;

        mergeSort(arr, low, mid);

        mergeSort(arr, mid + 1, length);

        merge(arr, low, mid, length);
    }

    private static void merge(int[] arr, int low, int mid, int length) {

        int counter = low, x = low, y = mid + 1;
        int[] b = new int[length];

        while (x <= mid && y <= length) {

            if (arr[x] < arr[y]) {

                b[counter] = arr[x];
                x++;

            } else {
                b[counter] = arr[y];
                y++;
            }
            counter++;
        }

        if (x <= mid) {

            for (int k = x; k <= mid; k++) {

                b[counter] = arr[k];
                counter++;
            }
        } else {

            for (int k = y; k < length; k++) {

                b[counter] = arr[k];
                counter++;
            }
        }

        for (int k = 0; k < length; k++) {

            arr[k] = b[k];
        }

        for (int i = low; i <= length; i++) {

            System.out.println(arr[i]);
        }
    }

}
