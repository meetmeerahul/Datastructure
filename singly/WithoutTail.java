public class WithoutTail {

  class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
    }
  }

  Node head = null;

  void addNode(int data) {
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

  void display() {
    Node temp = head;
    while (temp != null) {
      System.out.println(temp.data);
      temp = temp.next;
    }
  }

  void delete(int key) {
    Node temp = head, prev = null;

    if (temp != null && temp.data == key) {
      head = temp.next;
      return;
    }

    while (temp != null && temp.data != key) {
      prev = temp;
      temp = temp.next;
    }

    temp = prev.next;
  }

  public static void main(String[] args) {
    WithoutTail list = new WithoutTail();
    list.addNode(10);
    list.addNode(20);
    list.delete(20);
    list.display();
  }
}
