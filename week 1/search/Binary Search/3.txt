class SmallestMissing
{

    public  int smallestMissing(int[] nums, int start, int end)
    {

        if (start > end) {
            return start;
        }
 
        int mid = start + (end - start) / 2;
 
       
        if (nums[mid] == mid) {
            return smallestMissing(nums, mid + 1, end);
        }
        else {
          
            return smallestMissing(nums, start, mid - 1);
        }
    }
 
    public static void main(String[] args)
    {
        int[] nums = { 0, 1, 2, 4, 5, 6};
 
        SmallestMissing sm=new SmallestMissing();
        int start = 0, end = nums.length - 1;
        
        System.out.println("The smallest missing element is "
                            + sm.smallestMissing(nums, start, end));
    }
}