import java.util.Arrays;

public class shiftElem {

  public static void main(String[] args) {
    int[] ar = {
      1,
      6,
      0,
      2,
      4,
      5,
      0,
      0,
      7,
      8,
      6,
      4,
      7,
      4,
      0,
      0,
      0,
      0,
      6,
      7,
      8,
      6,
      4,
      6,
      6,
      6,
    };
    int target = 0;
    for (int i = 0; i < ar.length - 1; i++) {
      if (ar[i] == target) {
        for (int j = ar.length - 1; j >= i; j--) {
          if (ar[j] != target) {
            int temp = ar[i];
            ar[i] = ar[j];
            ar[j] = temp;
          }
        }
      }
    }

    System.out.println(Arrays.toString(ar));
  }
}
