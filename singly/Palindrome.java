public class Palindrome {

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

  public boolean checkPlaindrome() {
    String str = "";

    Node temp = head;

    while (temp != null) {
     
      
      temp = temp.next;
    }

    int num = Integer.parseInt(str);

    int copy = 0, rev = 0, rem = 0;

    copy = num;
    
    while (copy > 0) {
      rem = copy % 10;
      rev = rev * 10 + rem;
      copy = copy / 10;
    }

    if (num == rev) {
      return true;
    }

    return false;
  }


  public void reverse(){

      Node prev=null;
      Node next=null;
      Node current=head;

      while(current!=null){

        next=current.next;
        current.next=prev;
        prev=current;
        current=next;

      }

     head=prev;
     
     Node temp=head;

      while(temp!=null){
        System.out.print(" "+temp.data);
        temp=temp.next;
      }


  }

  public static void main(String[] args) {
    Palindrome list = new Palindrome();
    list.addNode(121);
    list.addNode(130);
    list.addNode(140);
    list.addNode(150);
    list.reverse();




    

    //System.out.println(list.checkPlaindrome());
  }
}
