public class binaryToDecimal {


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

        Node newNode=new Node( data);

        if(head==null){
            head=newNode;
        }
        else{

            tail.next=newNode;
        }
        tail=newNode;
    }

    public void display(){


        Node temp=head;

        if(temp==null){

            System.out.println("List is empty");
            return;
        }

        while(temp!=null){

            System.out.print(" " +temp.data);
            temp=temp.next;
        }
    }

    public int convert(){
       
        String str="";
        Node temp=head;



        if(temp==null){

            System.out.println("List is empty");
            return 0;
        }

        
        while(temp!=null){

            str=str+temp.data;

            temp=temp.next;
        }

        return  Integer.parseInt(str,2);

    }


    public static void main(String[] args) {
        
        binaryToDecimal list=new binaryToDecimal();


        int[] arr={1,1,1};


        for(int i=0;i<arr.length;i++)
        
        {

            list.addNode(arr[i]);

        }

        list.display();
        System.out.println();
        System.out.println( list.convert());
       

    }
    
}
