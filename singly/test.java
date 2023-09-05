public class test {

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
      System.out.println("List is Empty");
      return;
    }

    while (temp != null) {
      System.out.println(temp.data);
      temp = temp.next;
    }
  }

  public static void main(String[] args) {
    int[] array = { 1, 2, 3, 4 };

    test list = new test();

    for (int i = 0; i < array.length; i++) {
      list.addData(array[i]);
    }

    list.display();
  }
}
