public class test {

    public static void main(String[] args) {
        

        int [] ar={1,2,3,4,5,6,7,9};
        int sum=0;

        for(int i=0;i<ar.length-1;i++){

                sum+=ar[i];
            
        }

        int tot=(ar.length* ((ar.length+1)))/2;

        System.out.println("Missing number is : "+ (tot-sum));
    }
    
}
