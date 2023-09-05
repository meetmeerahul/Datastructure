public class SelectionSort {

  public static int[] selectionSort(int[] arr) {
    int i, j, min;

    for (i = 0; i < arr.length - 2; i++) {
      min = i;

      for (j = i + 1; j <= arr.length - 1; j++) {
        if (arr[j] < arr[min]) {
          min = j;
        }
      }
      
      int temp = arr[i];
      arr[i] = arr[min];
      arr[min] = temp;
    }
    return arr;
  }

  public static void main(String[] args) {
    int[] arr = { 2, 4, 5, 1, 67, 12, 23, 43, 54, 4, 67, 13 };

    int[] a = selectionSort(arr);

    for (int i = 0; i < a.length; i++) {
      System.out.print(" " + a[i]);
    }
  }
}
