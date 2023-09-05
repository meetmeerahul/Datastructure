public class Merge {

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
    }

    while (temp != null) {
      System.out.println(temp.data);
      temp = temp.next;
    }
  }

  public void bigDisplay() {
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
    Node current = head, next = null;

    while (current != null) {

      next = current.next;

      while (next != null && next.data == key) {

        next = next.next;

      }

      current.next = next;

      if (next == tail) 
      
      {
        tail = current;
        break;
      }

      current = next;
    }
  }

  public static void main(String[] args) {
    Merge list = new Merge();

    int[] arr = {
      2,
      2,
      5,
      6,
      6,
      6,
      7,
      8,
      8,
      8,
      8,
      8,
      8,
      8,
      8,
      9,
      10,
      10,
      10,
      10,
      10,
    };

    for (int i = 0; i < arr.length; i++) {
      list.addNode(arr[i]);
    }

    // list.display();

    list.delete(2);

    list.display();
  }
}
