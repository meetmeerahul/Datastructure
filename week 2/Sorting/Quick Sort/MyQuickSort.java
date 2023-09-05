public class MyQuickSort {


    public static void main(String[] args) {
        int arr[] = {10,9,8,7,6,5,4,3,2,1};
        quickSort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }


    public static void quickSort(int[] items, int startIndex, int endIndex) {
        if (endIndex - startIndex < 1) {
            return;
        }
        
        int pivotIndex = partition(items, startIndex, endIndex);
        quickSort(items, startIndex, pivotIndex - 1);
        quickSort(items, pivotIndex + 1, endIndex);
    }

    public static int partition(int[] items, int startIndex, int endIndex) {
        int left = startIndex;

        
        int right = endIndex - 1;
        int pivot = items[endIndex];

        while (left < right) {
            while (left <= right && items[left] < pivot) {
                ++left;
            }
            while (left <= right && items[right] > pivot) {
                --right;
            }
            if (left < right) {
                int temp_item = items[left];
                items[left] = items[right];
                items[right] = temp_item;
            }
        }

        //swap pivot to the new position
        if (items[left] > pivot) {
            int temp_item = items[left];
            items[left] = pivot;
            items[endIndex] = temp_item;
        }
        return left;
    }

}