import java.util.Scanner;  
public class ArrayInputExample1   
{  
public static void main(String[] args)   
{  
int n;  
try (Scanner sc = new Scanner(System.in)) {
    System.out.print("Enter the number of elements you want to store: ");  
    
    n=sc.nextInt();  
     
    int[] array = new int[n*2];  
    
    System.out.println("Enter the elements of the array: ");  
    for(int i=0; i<n; i++)  
    {  
    
    array[i]=sc.nextInt();  
    }  
    n*=2;
    int j=0;
    for(int i=n/2;i<n;i++){
            array[i]=array[j];
            j++;
        
    }
    System.out.println("");
    for (int i=0; i<n; i++)   
    {  
    System.out.print(" "+array[i]);  
    }
}  


} 



}