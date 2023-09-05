public class QuickTest {

  public static void main(String[] args) {
    int arr[] = { 13, 6, 7, 8, 1, 9, 10, 2, 4, 3 };
    quickSort(arr, 0, arr.length - 1);

    for (int i = 0; i < arr.length; i++) {
      System.out.print(" " + arr[i]);
    }
  }

  public static void quickSort(int[] arr, int lb, int ub) {
    if (lb < ub) {
      int loc = partition(arr, lb, ub);
      quickSort(arr, lb, loc - 1);
      quickSort(arr, loc + 1, ub);
    }
  }

  private static int partition(int[] arr, int lb, int ub) {
    int pivot = arr[lb];

    int start = lb;
    int end = ub;

    while (end > start) {
      while (arr[start] < pivot) {
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
}
