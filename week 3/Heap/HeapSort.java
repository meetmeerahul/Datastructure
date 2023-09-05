public class HeapSort {

    public static void sort(int arr[]) {


        int n = arr.length;

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        // One by one extract an element from heap

        for (int i = n - 1; i > 0; i--) {

            swap(arr,i,0);
            heapify(arr, i, 0);
        }
    }


    public static void swap(int[] arr,int i,int j){

        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }


    // To heapify a subtree rooted with node i which is
    // an index in arr[]. n is size of heap

    static void heapify(int arr[], int n, int i) {
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (l < n && arr[l] > arr[largest])
            largest = l;

        // If right child is larger than largest so far
        if (r < n && arr[r] > arr[largest])
            largest = r;
        if (largest != i) {
           swap(arr,largest,i);
            heapify(arr, n, largest);
        }
    }



    // Driver code
    public static void main(String args[]) {
        int arr[] = { 12, 11, 13, 5, 6, 7 };
        sort(arr);
        System.out.println("Sorted array is");
        for (int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + " ");
    }
}
