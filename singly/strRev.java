import java.util.Arrays;

public class strRev {
    public static void main(String[] args) {
        

        String r="rahul";
        String st="";
        char[] name=new char[r.length()];


        for(int i=0;i<r.length();i++){
            name[i]=r.charAt(i);
        }

        for(int i=0,j=r.length()-1;i<=r.length()/2;i++,j--){

            char temp=name[i];
            name[i]=name[j];
            name[j]=temp;
        }

   

       for(int i=0;i<r.length();i++){
        System.out.print(name[i]);
       }
    }
}
