import java.util.Scanner;

public class Factorial {

  public static void main(String args[]) {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter A Number To find Factorial :");
        int n=sc.nextInt();
        long nFactoriral = factorialProgram(n);
        System.out.println("factorial of "+ n +"is : "+nFactoriral);
    }
  }


  public static long factorialProgram(long n) {
    if (n <= 1) {
      return 1;
    } else {
      return n * factorialProgram(n - 1);
    }
  }
}