public class Singly {

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
      System.out.println("Element Added");
    }
    tail = newNode;

  }

  public void display() {
    Node temp = head;

    if (temp == null) {
      System.out.println("List is empty !");
    }

    while (temp != null) {
      System.out.print(" " + temp.data);
      temp = temp.next;
    }
  }

  public void insertAfter(int data, int after) {
    Node temp = head;
    Node newNode = new Node(data);

    while (temp != null && temp.data!= after) {
      temp = temp.next;
    }

    if (temp == null) {
      System.out.println("That element note in this list !!");
      return;
    }

    if (temp == tail) {
      temp.next = newNode;
      tail = newNode;
      return;
    }

    newNode.next = temp.next;
    temp.next = newNode;
  }

  public void deleteElement(int elem) {
    Node temp = head, prev = null;

    if (temp == head && temp.data == elem) {
      head = temp.next;
      return;
    }

    while (temp != null && temp.data != elem) {
      prev = temp;
      temp = temp.next;
    }

    if (temp == tail) {
      tail = prev;
      tail.next = null;
      return;
    }

    prev.next = temp.next;
  }

  public void search(int data){



    Node temp=head;

    if(temp==null){
        System.out.println("The list is empty !");
        return;
    }


    while(temp!=null){

        if (temp.data==data){
            System.out.println("Element found in the list");
            return;
        }
        temp=temp.next;
    }


    System.out.println("Element not found");
    

  }

  public static void main(String[] args) {
    Singly list = new Singly();

    list.addNode(20);
    list.addNode(30);
    list.addNode(40);

    list.insertAfter(15, 20);

    list.insertAfter(35, 30);

    list.insertAfter(55, 40);

    list.insertAfter(55, 400);



    
    list.display();
    System.out.println();
    list.deleteElement(20);
    list.deleteElement(30);
    list.deleteElement(55);
    list.display();

    list.search(40);
  }
}
