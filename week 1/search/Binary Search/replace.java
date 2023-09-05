public class replace {

    public static void main(String[] args) {
        

        int [] arr={1,2,3,4,5,6,7,8};
        int n=arr.length;


            arr[0]=arr[n-1];
        

        n--;
        for(int i=0;i<n;i++){

            System.out.println(arr[i]);
        }
    }
    
}
