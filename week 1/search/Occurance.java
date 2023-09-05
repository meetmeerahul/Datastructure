class Occurance
{
    
    public static int binarySearch(int[] array, int target, boolean searchFirst)
    {

        int start = 0;
        int end = array.length - 1;
 

        int result = -1;
 

        //If SearchFirst is true finds the first occurance
        // If it is false finds the last occurance
        while (start <= end)
        {
           
            int mid = (start + end) / 2;
 
           
            if (target == array[mid])
            {
                result = mid;
 
               
                if (searchFirst) {
                    end = mid - 1;
                }
            
                else {
                    start = mid + 1;
                }
            }
 
          
            else if (target < array[mid]) {
                end = mid - 1;
            }
        
            else {
                start = mid + 1;
            }
        }
 
       
        return result;
    }
 
    public static void main(String[] args)
    {
        int[] array = {2, 5, 5, 5, 6, 6, 8, 9, 9, 9};
        int target = 5;
 

        int first = binarySearch(array, target, true);
 

        int last = binarySearch(array, target, false);
 
        int count = last - first + 1;
 
        if (first != -1) {
            System.out.println("Element " + target + " occurs " + count + " times");
        }
        else {
            System.out.println("Element not found in the array");
        }
    }
}
