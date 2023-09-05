import java.util.HashSet;

public class FirstRepatingElement {

  static int getFirstRepeatingElementArray(int array[]) {
    int minimumIndex = -1;

    HashSet<Integer> set = new HashSet<>();

    for (int i = array.length - 1; i >= 0; i--) {
      if (set.contains(array[i])) 
        minimumIndex = i; 
      else 
        set.add(array[i]);
    }
    return minimumIndex;

  }

  public static void main(String[] args) throws java.lang.Exception {
    int arr[] = { 10, 7, 8, 1, 8, 7, 6 };




    for(int i=0;i<arr.length;i++){

      System.out.print(" "+arr[i]);
  }
 System.out.println("\n");



    int min = getFirstRepeatingElementArray(arr);

    if (min != -1)
        System.out.println("The first repeating element in array is " + arr[min]); 
    else 
        System.out.println("There are no repeating elements");
  }
}
