public class replaceAndCombain {

  public static String replace(char[] text) {
    int len = text.length;
    for (int i = 0; i < len - 1; i++) {
      if (text[i] == '#') {
        for (int j = i - 1; j < len - 2; j++) {
          text[j] = text[j + 2];
        }
        len -= 2;
      }
    }

    char[] st = new char[len];

    for (int i = 0; i <= len - 1; i++) {
      st[i] = text[i];
    }

    return new String(st);
  }

  public static void main(String[] args) {
    char[] a = { 'a', 'b', 'c', '#', 'd', 'z' };

    char[] b = { 'a', 'b', 'c', '#', 'd', 'z' };

   // System.out.println(replace(a)+" "+replace(b));
    if (replace(b).equals(replace(a))) {
      System.out.println("true");
    } else {
      System.out.println("False");
    }
  }
}
