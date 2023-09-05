import java.util.Arrays;

public class strRev {

    public static void main(String[] args) {
        
        char[] ar={'r','a','h','u','l'};



        for(int i=0,j=ar.length-1;i<ar.length/2;i++,j--){

            char temp=ar[i];
            ar[i]=ar[j];
            ar[j]=temp;
        }

        System.out.println(Arrays.toString(ar));
    }
    
}
