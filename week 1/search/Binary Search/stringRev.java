
public class stringRev {

    public static void main(String[] args) {
        

        String str="Rahulp";
        char[] ch=new char[str.length()];
        char tem;

        for(int i=0;i<str.length();i++){
            ch[i]=str.charAt(i);
        }
        System.out.println("Orginal string : ");
        for(int i=0;i<str.length();i++){
            System.out.print(ch[i]);
         }

         if(ch[0]=='R'){
            ch[0]='B';
        }
     
         System.out.println("\nReversed string : ");
        for(int i=0,j=str.length()-1;i<str.length()/2;i++,j--){
          tem=ch[i];
          ch[i]=ch[j];
          ch[j]=tem;    
        }


        
        for(int i=0;i<str.length();i++){
           System.out.print(ch[i]);
        }
    }
    
}
