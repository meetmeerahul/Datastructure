import java.util.Arrays;

public class test {


    public static void main(String[] args) {
        


        char[] arr={'r','a','h','u','l'};


        char a=arr[arr.length-1];


        for(int i=arr.length-1;i>0;i--){

            arr[i]=arr[i-1];

        }


        arr[0]=a;

        System.out.println(Arrays.toString(arr));
    }
    
}
