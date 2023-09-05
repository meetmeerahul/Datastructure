public class palArray {

  public static void main(String[] args) {
    int[] ar = { 1, 2, 2, 2, 2, 2, 1 };

    boolean pal = true;

    for (int i = 0, j = ar.length - 1; i < ar.length / 2; i++, j--) {
      if (ar[i] != ar[j]) {
        pal = false;

        break;
      }
    }

    if (pal == true) {
      System.out.println("Palindrome");
    } else {
      System.out.println("Not palindrome");
    }
  }
}
