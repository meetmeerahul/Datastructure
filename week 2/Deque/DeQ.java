public class DeQ {


    private static int front, rear, capacity;
    private static int dqueue[];


    DeQ(int size){

        front=rear=-1;
        capacity=size;
        dqueue=new int[size];
    }
    

    public void insertFromFront(int data){


        if(front==-1 && rear==-1){
            front=rear=0;
            dqueue[front]=data;
            return;
        }

        if(rear==capacity-1){
           
            System.out.println("Overflow !!");
            return;
        }

        rear++;
        dqueue[rear]


    }
}
