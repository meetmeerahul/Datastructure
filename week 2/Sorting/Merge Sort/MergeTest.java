

public class MergeTest {

    public static void merge(int a[], int start, int mid, int end) {
      int i, j, c = start;
  
      int b[] = new int[end + 1];
  
      for (i = start, j = mid + 1; i <= mid && j <= end; c++) {
  
  
        if (a[i] <= a[j])
        
        {
          b[c] = a[i++];
        }
        
        else 
        
        {
          b[c] = a[j++];
        }
      }
      while (i <= mid) {
        b[c++] = a[i++];
      }
  
      while (j <= end) {
        b[c++] = a[j++];
      }
  
      for (i = start; i <= end; i++) {
        a[i] = b[i];
      }
    }
  
    public static void Sort(int a[], int start, int end) {
      if (start < end) {
        int mid = (start + end) / 2;
        Sort(a, start, mid);
        Sort(a, mid + 1, end);
        merge(a, start, mid, end);
      }
    }
  
    public static void printarray(int a[]) {
      for (int i = 0; i < a.length; i++) {
        System.out.print(a[i] + "  ");
      }
    }
  
    public static void main(String[] args) {
      int n;
      n = 6;
      int a[] = { 12, 11, 13, 5, 6, 7 };
      Sort(a, 0, n - 1);
      printarray(a);
    }
  }
  