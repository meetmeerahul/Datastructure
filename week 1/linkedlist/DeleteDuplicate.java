public class DeleteDuplicate {
    

    class Node{

        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data=data;
        }
    }


    public Node head=null;
    public Node tail=null;


    public void addNode(int data){
    
        Node newNode= new Node(data);


        if(head==null){
            head=newNode;
        }
        else{
            tail.next=newNode;
            newNode.prev=tail;
        }
        tail=newNode;

    }

    public void display(){


        int count=0;
        Node temp=head;
        if (temp==null){
            System.out.println("List is Empty");
        }
        while(temp!=null){

            count+=1;

            if(count==1)
            System.out.print(temp.data+ " " );
            temp=temp.next;
        }
        System.out.println();
    }

    public void deleteDup(){


        Node current=head;

        while(current!=null){

            Node next=current.next;

            while (next!=null && next.data==current.data){
                next=next.next;
            }
             current.next=next;
 
             if(next==tail){

                tail=current;
                break;
             }
             
           current=next;
        }
    }

    public static void main(String[] args) {

        int[] array = new int[]{2,2,2,5,6,6,6,7,8,8,8,8,8,8,8,9,10,10,10,10,10};

        DeleteDuplicate list=new DeleteDuplicate();

        for(int i=0;i<array.length;i++){
            list.addNode(array[i]);
        }
        //list.display();

        //list.deleteDup();

        list.display();
    }
}
