public class replaceChar {


    public static String replace(String str,int key)
    {

        int newKey=key%26;

        char[] charArray=new char[str.length()];


        for(int i=0;i<str.length();i++){

            int letteerPos=str.charAt(i)+newKey;


            if(letteerPos<=122){

                charArray[i]=(char) letteerPos;
            }
            else{

                charArray[i]=(char) (letteerPos+96%122);
            }

        }
        return new String(charArray);

    }

    public static void main(String[] args) {
        String str="rahul";
        int key=4;
        System.out.println(replace(str, key));
    }
    
}
