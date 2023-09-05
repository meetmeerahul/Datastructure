public class OddONe {



    public static void main(String[] args) {
        

        char[] name={'a','b','a','a','a','a','b','a'};


        for(int i=0;i<name.length-2;i++){

            if(name[i]-name[i+1]!=0){
                System.out.println(name[i+1]);
                break;
            }
        }
    }
    
}
