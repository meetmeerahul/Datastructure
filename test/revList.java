public class revList {

  class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
    }
  }

  public Node head = null;
  public Node tail = null;

  public void addData(int data) {
    Node newNode = new Node(data);

    if (head == null) {
      head = newNode;
    } else {
      tail.next = newNode;
    }
    tail = newNode;
  }


  public void display(){


    Node temp=head;


    if(temp==null){
        System.out.println("List is empty");
        return;
    }
    while(temp!=null){


        System.out.println(temp.data);
        temp=temp.next;
    }
  }


  public void reverse(){


    Node current=head,next=null,prev=null;


    while(current!=null){

        next=current.next;
        current.next=prev;
        next=current;
        current=next;
    }

   // display();
  }


  public static void main(String[] args) {
    

    revList list= new revList();



    int[] arr={1,2,3,4,5};


    for(int i=0;i<arr.length;i++){


        list.addData(arr[i]);
    }

    
    //list.reverse();
    list.display();
  }
}
