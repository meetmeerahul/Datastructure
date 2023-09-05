public class InsertionSort {

  public static void insertionSort(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
      int temp = arr[i];

      int j = i - 1;

      while (j >= 0 && temp <= arr[j]) {
        arr[j + 1] = arr[j];
        j = j - 1;
      }
      arr[j + 1] = temp;
    }

    for (int i = 0; i < arr.length; i++) {
      System.out.print(" " + arr[i]);
    }
  }

  public static void main(String[] args) {
    int[] arr = { 12, 4, 6, 2, 3, 8, 7, 5 };

    insertionSort(arr);
  }
}
