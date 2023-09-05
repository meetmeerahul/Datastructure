public class singlyTest {

    class Node{

        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }

    public Node head=null;
    public Node tail=null;

    public void addNode(int data){
        Node newNode= new Node(data);
        if (head==null){

            head=newNode;
            System.out.println("Node Created ");
        }
        else
        {
            tail.next=newNode;
            System.out.println("New Node Added");
        }
        tail=newNode;
        
    }

    public void displayNodes(){


        if(head==null){
            
            System.out.println("List is now empty");
        }

        Node temp=head;

        while (temp!=null){

            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    public void deleteElements(int data){

        Node temp=head;
        Node previous=null;
        
        if(temp!=null && temp.data==data){

            head=temp.next;
            return;
        }
        
        while(temp!=null && temp.data!=data){

            previous=temp;
            temp=temp.next;
        }
     
        if(temp==null){
            return;
        }

        if(temp==tail){

            tail=previous;
            tail.next=null;
            return;
        }

        previous.next=temp.next;

    }

    public void insertBtw(int nextTo,int data){


        Node newNode=new Node(data);
        Node temp=head;

        while(temp!=null && temp.data!=nextTo){
            temp=temp.next;
        }

        if(temp==null){
            return;
        }

        if(temp==tail){
            temp.next=newNode;
            tail=newNode;
            return;
        }

        newNode.next=temp.next;
        temp.next=newNode;
    }


    public void displaySelected(int key){

        Node temp=head;
       int count=0;
        while(temp!=null){
          count+=1;

          if(count==key){

            System.out.println(temp.data);
            return;
          }

          temp=temp.next;

        }




    }


    public static void main(String[] args) {
        

        singlyTest list=new singlyTest();
        //list.displayNodes();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);
        list.addNode(6);
        //list.displayNodes();

        //list.deleteElements(300);
        //list.insertBtw(30,35);
      //  list.displayNodes();

        list.displaySelected(6);

    }

    
}
