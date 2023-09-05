public class dblLinked {

  class Node {
    int data;
    Node next;
    Node prev;

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

      newNode.prev = tail;
    }
    tail = newNode;
  }

  public void displayData() {
    Node temp = head;

    if (temp == tail) {
      System.out.println(temp.data);
      return;
    }
    while (temp != null) {
      System.out.print(" " + temp.data);
      temp = temp.next;
    }
  }

  public void revList(){


    Node temp=tail;

    while(temp!=null){

        System.out.print(" "+temp.data);

        temp=temp.prev;
    }


  }

  public static void main(String[] args) {
    
    dblLinked list= new dblLinked();
    list.addData(10);
    list.addData(20);
    list.addData(30);
    list.displayData();
    System.out.println();
    list.revList();
  }
}
