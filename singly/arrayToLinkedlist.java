public class arrayToLinkedlist {
    static class  Node{
       int data;
       Node next;
       
       Node(int data){
           this.data = data;
       }
    }
       public static Node head=null;
       
       public static void arrToLinkedList(int arr[]) 
       {
           Node head = new Node(arr[0]);
           arraToLinkedListRev(head,arr,1);
           
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
       

       static void arraToLinkedListRev(Node current,int arr[],int index) {
       if(index==arr.length) {
           return;
       }
       current.next = new Node(arr[index]);
       arraToLinkedListRev(current.next,arr,index+1);
           
       }

       public static void main(String []args) {
           int[] arr= {1,2,3,4};
           arrToLinkedList(arr);
           display();
       }
   }