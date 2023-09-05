public class convertChar {

    public static void main(String[] args) {


        char[] arr={'a','b','a','b','a','b'};


        for(int i=0;i<arr.length;i++){

            if(i<arr.length/2 && arr[i]=='a'){

                arr[i]='b';
            }

            if(i>=arr.length/2 && arr[i]=='b'){

                arr[i]='a';
            }
        }
        
        for(int i=0;i<arr.length;i++){

            System.out.println(arr[i]);
        }
    }
    
}
