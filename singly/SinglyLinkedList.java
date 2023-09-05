
import java.util.Scanner;

public class SinglyLinkedList {

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
      System.out.println("Node Created");
    } else {
      tail.next = newNode;
      System.out.println(" New Node Added");
    }
    tail = newNode;
  }

  public void display() {
    if (head == null) {
      System.out.println("List is empty");
      return;
    }

    Node temp = head;

    while (temp != null) {
      System.out.print(" " + temp.data);
      temp = temp.next;
    }
  }

  public void delete(int data) {
    Node temp = head, previous = null;

    if (temp != null && temp.data == data) {
      head = temp.next;
      System.out.println("Deleted : " + data);
      return;
    }

    while (temp != null && temp.data != data) {
      previous = temp;
      temp = temp.next;
    }

    if (temp == null) {
      System.out.println(data + " doesnt exist in list !!");
      return;
    }

    if (temp == tail) {
      tail = previous;
      tail.next = null;
      return;
    }
    previous.next = temp.next;
    System.out.println("Deleted : " + data);
  }

  public void insertBtw(int nextTo, int data) {
    Node newNode = new Node(data);
    Node temp = head;

    while (temp != null && temp.data != nextTo) {
      temp = temp.next;
    }

    if (temp == null) {
      System.out.println(nextTo + " Note in the list !!");
      return;
    }

    if (temp == tail) {
      tail.next = newNode;
      tail = newNode;
      System.out.println("Inserted : " + data + " " + "After" + nextTo);
      return;
    }
    newNode.next = temp.next;
    temp.next = newNode;
    System.out.println("Inserted : " + data + " " + "After" + nextTo);
  }

  public void displayBackWard() {
    Node temp = head;
    Node prev = null, current = null;

    while (temp != null) {
      current = temp;
      temp = temp.next;
      current.next = prev;
      prev = current;
      head = current;
    }
    display();
  }

  public void insertAsFirst(int value) {
    Node newNode = new Node(value);

    Node temp = head;

    if (head == null) {
      newNode = head;
      return;
    }
    newNode.next = temp;
    head = newNode;
  }

  public void sort() {
    Node current = head, next = null;

    int temp;

    while (current != null) {

      next = current.next;

      while (next != null) {

        if (current.data > next.data) {

          temp = next.data;
          next.data = current.data;
          current.data = temp;
          
        }

        next = next.next;
      }
      current=current.next;
    }
  }

  public static void main(String[] args) {
    SinglyLinkedList list = new SinglyLinkedList();

    boolean ctrl = true;

    while (ctrl) {
      System.out.println("\n----------------------------------");
      System.out.println("Choose An Option");
      System.out.println("1.Insert ");
      System.out.println("2.Display");
      System.out.println("3.Insert Next To");
      System.out.println("4.Display Reverse");
      System.out.println("5.Delete");
      System.out.println("6.Exit");
      System.out.println("7.Insert As First Element");
      System.out.println("8.Sort");
      try (Scanner sc = new Scanner(System.in)) {
        int option = sc.nextInt();
        int value, elem;

        switch (option) {
          case 1:
            System.out.println("Enter Value :");
            value = sc.nextInt();
            list.addNode(value);
            break;
          case 2:
            list.display();
            break;
          case 3:
            System.out.println("Next to which element :");
            elem = sc.nextInt();
            System.out.println("Which value :");
            value = sc.nextInt();
            list.insertBtw(elem, value);
            break;
          case 4:
            list.displayBackWard();
            break;
          case 5:
            System.out.println("Which value :");
            value = sc.nextInt();
            list.delete(value);
            break;
          case 6:
            ctrl = false;
            break;
          case 7:
            System.out.println("Which value :");
            value = sc.nextInt();
            list.insertAsFirst(value);
            break;
          case 8:
            list.sort();
            list.display();
        }
      }
    }
  }
}
