//BinaryToDecimal

class test {

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

  public void displayNodes(){

    Node temp=head;

    if(temp==null){

        System.out.println("List is Empty");
        return;
    }

    while(temp!=null){

        System.out.println(temp.data);
        temp=temp.next;
    }
  }

  public int displayAsDecimal(){


    int total=0;
    Node temp=head;

    if(temp==null){

        System.out.println("List is empty");
        return 1;
    }

    while(temp!=null){

      total=total*2+temp.data;
        temp=temp.next;
    }

    
   

return total;

  }

  public static void main(String[] args) {
    
    test list=new test();

    int [] array={1,1,1,1};


    for(int i=0;i<array.length;i++)
    {
        list.addData(array[i]);
    }

    list.displayNodes();

    System.out.println( "Decimal Equilant is :"+list.displayAsDecimal());

  }
}