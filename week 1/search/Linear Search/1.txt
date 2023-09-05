import java.util.Scanner;

public class LinearSearch {

    public static boolean lSearch(int arr[],int key){

       for(int i=0;i<arr.length;i++){

        if(arr[i]==key){
            return true;

        }
       }

       return false;
    }

    public static void main(String[] args) {
        

        int arr[] = { 2, 3, 4, 10, 40 };
        for(int i=0;i<arr.length;i++){

            System.out.print(" "+arr[i]);
        }

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("\nEnter Key to search :");
            int key=sc.nextInt();


  

            boolean result= lSearch(arr,key);


            if(result){
                
                System.out.println("Element present  in the array"); 
            }
            else{
                System.out.println("Element present Not in the array"); 
            }
        }
        
    }
    
}
