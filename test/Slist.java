public class Slist {

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

  public void display() {
    Node temp = head;

    if (temp == null) {
      System.out.println("List is empty");
    }

    while (temp != null) {
      System.out.println(temp.data);
      temp = temp.next;
    }
  }

  public void delete(int key) {
    Node temp = head, prev = null;

    if (temp != null && temp.data == key) {
      head = temp.next;
      return;
    }
    while (temp != null && temp.data != key) {
      prev = temp;
      temp = temp.next;
    }

    prev.next = temp.next;
  }


  public void reverse(){



    Node current=head,next=null,prev=null;


    while(current!=null){

      next=current.next;
      current.next=prev;
      prev=current;
      current=next;
      
    }

    display();
  }

  public void deleteRep() {
    Node current = head, next = null;

    while (current != null) {
      next = current.next;

      while (next != null && next.data == current.data) {
        next = next.next;
      }

      current.next = next;

      if (next == tail) {
        tail = current;
      }
      current = next;
    }
  }

  public static void main(String[] args) {
    Slist list = new Slist();

    list.addData(10);
    list.addData(10);
    list.addData(10);
    list.addData(10);
    list.addData(20);
    list.addData(30);
    list.addData(30);
    list.addData(30);
    list.addData(30);
    list.addData(30);
    list.addData(40);
    list.addData(40);
    list.addData(40);
    list.addData(40);
    //list.deleteRep();
    //list.delete(40);
    //list.display();

    list.reverse();
  }
}
