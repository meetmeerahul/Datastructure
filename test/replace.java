class replace{

    public static void main(String[] args) {
        
        char[] ar={'r','a','h','u','l','p'};

        char temp=ar[ar.length-1];


        for(int i=ar.length-1;i>0;i--){

            ar[i]=ar[i-1];
        }

        ar[0]=temp;

        for(int i=0;i<ar.length;i++){

            System.out.print(ar[i]);

        }
    }
}