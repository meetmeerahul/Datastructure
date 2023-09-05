public class ArrayToLInkedRec {

  static class Node {
    int data;
    Node next;

    Node(int data)
    
    {
      this.data = data;
    }
}
    public static Node head = null;


    public static void getingArray(int arr[]) 
    {
      Node head = new Node(arr[0]);

      arrayToList(head, arr, 1);

    }

     static void arrayToList(Node current, int arr[], int index)
     {
      if (index==arr.length)
       {
        return;
      }
       
        current.next = new Node(arr[index]);
        arrayToList(current.next, arr, index+1);
      
    }

    static void display() {
        Node temp = head;
        if(temp==null) {
            return;
        }
        while(temp!=null) {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    

  public static void main(String[] args) 
  
  {
    int[] arr = { 1, 2, 3, 4, 5 };

    getingArray(arr);
    display();
  }

}