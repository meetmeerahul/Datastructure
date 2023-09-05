public class recur {

  public static int binsearchRecur(int arr[], int key, int start, int end) {
    int mid;

    if (start > end) {
      return 0;
    } else {
      mid = (start + end) / 2;
      if (key == arr[mid]) {
        return mid;
      } else if (arr[mid] < key) {
        return binsearchRecur(arr, key, mid + 1, end);
      } else {
        return binsearchRecur(arr, key, start, mid - 1);
      }
    }

  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 4, 5, 12, 15, 18, 21, 22, 28 };
    int start = 0, end = arr.length - 1;
    System.out.println(binsearchRecur(arr, 4, start, end));
  }
}
