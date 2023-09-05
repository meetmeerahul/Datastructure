import java.util.Scanner;

public class Fibonacci{
	public static int fibonacciRec(int n){
	if(n == 0){
		return 0;
	}
	if(n == 1 || n == 2){
			return 1;
		}
	return fibonacciRec(n-2) + fibonacciRec(n-1);
	}
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Limit:");
            int lim=sc.nextInt();
 
       
            System.out.print("Fibonacci Series of "+lim+" numbers: ");
            for(int i = 0; i < lim; i++){
                    System.out.print(fibonacciRec(i) +" ");
                }
        }
	}
}