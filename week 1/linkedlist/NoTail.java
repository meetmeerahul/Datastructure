public class NoTail {

  class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
    }
  }

  public Node head = null;

  public void addData(int data) {
    Node newNode = new Node(data);
    Node temp = head;

    if (head == null) {
      head = newNode;
      return;
    }
    while (temp.next != null) {
      temp = temp.next;
    }
    temp.next = newNode;
  }

  public void display() {
    Node temp = head;

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

  public static void main(String[] args) {
    NoTail list = new NoTail();

    list.addData(10);
    list.addData(20);
    list.addData(30);
    list.addData(50);

    list.delete(20);

    list.display();
  }
}
