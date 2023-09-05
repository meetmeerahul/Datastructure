

public class replaceNumber {

    public static int[] moveValueToEnd(int [] array,int target) {

        int length = array.length;

        int i=0,temp,j=length-1;

        while(i<j) {

            if(array[j]==target)
             {
                j = j-1;
            }

            if(array[i]==target)
             {
                temp=array[i];
                array[i]=array[j];
                array[j]=temp;
            }
            i++;
        }

        return array;
    }
    public static void main(String[] args) {

       int []a= {6,1,6,8,10,4,15,6,3,9,6};
       int target =6;
       System.out.print("Before Shifting :");
       for(int i=0;i<a.length;i++) {
        System.out.print(a[i]+ " ");
    }
       int [] array = moveValueToEnd(a,target);

       System.out.print("\nAfter Shifting  :");

       for(int i=0;i<array.length;i++) {
        System.out.print(array[i]+ " ");
       }
   }
}
