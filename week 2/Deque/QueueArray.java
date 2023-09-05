import java.util.Scanner;

public class QueueArray {

    private static int front, rear, capacity;
    private static int queue[];

    QueueArray(int size) {

        front = rear = -1;
        capacity = size;
        queue = new int[capacity];

    }

    static boolean isFull() {
        if (rear == capacity - 1) {
            return true;
        } else {
            return false;
        }
    }

    boolean isEmpty() {
        if (front == -1 && rear == -1) {
            return true;
        } else {
            return false;
        }
    }

    void enQueue(int itemValue) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else if (front == -1 && rear == -1) {
            front = rear = 0;
            System.out.println(itemValue + " Inserted ");
            queue[rear] = itemValue;
        } else {

            rear++;
            queue[rear] = itemValue;
            System.out.println(itemValue + " Inserted ");
        }
    }

    void deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Nothing to dequeue");
        } else if (front == rear) {
            System.out.println(queue[front] + " Removed ");
            front = rear = -1;
        } else {

            System.out.println(queue[front] + " Removed ");
            front++;
        }
    }

    void display() {
        int i;

        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            for (i = front; i <= rear; i++) {
                System.out.print(" " + queue[i]);
            }
        }
    }

    void peak() {

        if (isEmpty()) {

            System.out.println("Front value is: " + queue[front]);
        }

        else {

            System.out.println("Front value is: " + queue[front]);
        }

    }

    public static void main(String[] args) {
        QueueArray queue = new QueueArray(10);

        boolean trigger = true;
        int opt, val;
        while (trigger)

        {
            System.out.println("\n");
            System.out.println("1.ENQUEUE");
            System.out.println("2.DEQUEUE");
            System.out.println("3.PEEK");
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