public class MidElem {

  class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
    }
  }

  public Node head = null;
  public Node tail = null;

  public void addNode(int data) {
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
      return;
    }

    while (temp != null) {
      System.out.println(temp.data);
      temp = temp.next;
    }
  }

  public void midEl() {
    Node fast = head, slow = head;


    if(head==null){
        System.out.println("List is empty");
        return;
    }

    while (fast != null && fast.next!=null) {
        fast = fast.next.next;
        slow = slow.next;
    }

    System.out.println(slow.data);
  }

  public static void main(String[] args) {
    MidElem list = new MidElem();

    list.addNode(10);
    list.addNode(20);
    list.addNode(30);
    list.addNode(40);
    list.addNode(50);
    list.addNode(60);
    list.addNode(60);
    
    list.midEl();
  }
}
