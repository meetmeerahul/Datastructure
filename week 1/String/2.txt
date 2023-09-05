import java.util.Scanner;

public class StringPalindromeProgram {

  public static boolean checkPalindrome(String input) {

    String reverse = "";
    int length = input.length();

    for (int i = length - 1; i >= 0; i--) {
      reverse = reverse + input.charAt(i);
    }

    if (input.equals(reverse)) {
      System.out.println(input + " is a palindrome  " );
    } else {
      System.out.println(input + " is not palindrome " );
    }
    return false;
  }

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Enter a string: ");
        String strInput = sc.nextLine();
        checkPalindrome(strInput);
    }

  }
}
