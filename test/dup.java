import java.util.Arrays;

public class dup {

  public static void main(String[] args) {
    char[] ar = { 'a', 'b', 'b', 'b', 'c' };

    int len = ar.length;

    for (int i = 0; i < len - 1; i++) {
      for (int j = i + 1; j < len - 1; j++) {
        if (ar[i] == ar[j]) {
          for (int k = j; k < len - 1; k++) {
            ar[k] = ar[k + 1];
          }
          j--;
          len-=1;
        }
      
      }
    }
    System.out.println(Arrays.toString(ar));
  }
}
