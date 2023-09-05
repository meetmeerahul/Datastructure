import java.util.Scanner;

public class QueueLinkedlist {

    class Node {

        int data;
        Node next;

        Node(int data) {

            this.data = data;
        }
    }

    public Node front = null;
    public Node rear = null;

    public void enQueue(int data) {

        Node newNode = new Node(data);

        if (front == null && rear == null) {

            front = newNode;
            System.out.println("Value Inserted");
        }

        else {
            rear.next = newNode;
            System.out.println("Value Inserted");
        }

        rear = newNode;
    }

    public void deQueue() {

        if (front == rear && front == null) {

            System.out.println("Queue is empty");
            return;
        }

        else if (rear == front && front.next == null) {

            rear = front = null;
            return;

        }

        front = front.next;

    }

    public void display() {

        Node temp = front;

        if (temp == null) {
            System.out.println("Queue is empty !!");

            return;
        }
        while (temp != null) {
            System.out.print(" " + temp.data);
            temp = temp.next;
        }
    }

    public void peak() {

        System.out.println("Peak Value is :" + rear.data);
    }

    public static void main(String[] args) {

        QueueLinkedlist queue = new QueueLinkedlist();

        boolean trigger = true;
        int opt, val;
        while (trigger)

        {
            System.out.println("\n");
            System.out.println("1.ENQUEUE");
            System.out.println("2.DEQUEUE");
            System.out.println("3.PEAK");
            System.out.println("4.Display");
            System.out.println("5.EXIT");

            Scanner sc = new Scanner(System.in);
            opt = sc.nextInt();

            switch (opt) {

                case 1:

                    System.out.println("Enter Element :");
                    val = sc.nextInt();
                    queue.enQueue(val);

                    break;
                case 2:
                    queue.deQueue();
                    break;
                case 3:
                    queue.peak();
                    break;
                case 4:
                    queue.display();
                    break;
                case 5:
                    trigger = false;
                    break;
                default:
                    System.out.println("INvalid option");
            }

        }
    }

}
