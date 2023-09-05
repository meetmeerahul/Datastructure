public class Main1
{
    static int fact(int n)
    {
        if (n == 50)
 
 // base condition resulting in stack overflow
            return 1;
        else   
            return n*fact(n-1);    
    }

public static void main(String[] args) {
    int result = fact(10);
     
        System.out.println("10! = " + result);
    }

}