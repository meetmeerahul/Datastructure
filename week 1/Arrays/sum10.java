import java.util.HashSet;
import java.util.Set;

public class sum10 {

    public static int[]  twoNumberSum(int[] array, int target) {

        Set<Integer> nums= new HashSet<>();
        
    for(int i=0;i<array.length-1;i++)
    {
        int num=array[i];
        int match=target-num;

        if(nums.contains(match))
        {
            return new int[]{num,match};
        }
        else{
            nums.add(num);
        }

    }
    return new int[0];
    
}

public static void main(String[] args) {
    
    int [] array = {1,2,4,5,45,7};
    int target=5;
    int [] result= twoNumberSum(array, target);

    for(int i=0;i<result.length;i++){
        System.out.println(result[i]);
    }

}
    
}
