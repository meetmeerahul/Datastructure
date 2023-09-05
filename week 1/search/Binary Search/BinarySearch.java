
class BinarySearch {

	int binarySearch(int arr[], int elem)
	{
		int start = 0, end = arr.length - 1;
		
		while (start <= end) {
			int mid = start + (end - start) / 2;

		
			if (arr[mid] == elem)
				return mid;

			else if (arr[mid] < elem)
			start = mid + 1;

	
			else
			end = mid - 1;
		}


		return -1;
	}


	public static void main(String args[])
	{
		BinarySearch ob = new BinarySearch();
		int arr[] = {1,2,6,7,12,14,23,34,45,51,56,60};

		int elem = 23;
		int result = ob.binarySearch(arr, elem);
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at "
							+ "index " + result);
	}
}
