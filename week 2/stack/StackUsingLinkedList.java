import java.util.Scanner;

public class StackUsingLinkedList {

    class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }


    public Node top = null;

    public void push(int data) {

        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;

    }


    public void pop() {

        if (top == null) {
            System.out.println("Underflow !!");
            return;
        }

        Node temp = top;
        top = temp.next;
    }

    

    public void display() {

        Node temp = top;

        if (top == null) {
            System.out.println("Underflow");
            return;
        }

        while (temp != null) {

            System.out.print(" " + temp.data);
            temp = temp.next;
        }
    }

    public void peek() {

        if (top == null) {
            System.out.println("Underflow !!");
            return;
        }

        System.out.println(top.data);
    }

    public static void main(String[] args) {

        StackUsingLinkedList list = new StackUsingLinkedList();

        boolean trigger = true;
        int opt, val;
        while (trigger)

        {
            System.out.println("\n");
            System.out.println("1.Push");
            System.out.println("2.POP");
            System.out.println("3.PEEK");
            System.out.println("4.Display");
            System.out.println("5.EXIT");

            Scanner sc = new Scanner(System.in);
            opt = sc.nextInt();

            switch (opt) {

                case 1:
                    System.out.println("Enter Element :");
                    val = sc.nextInt();
                    list.push(val);
                    break;
                case 2:
                    list.pop();
                    break;
                case 3:
                    list.peek();
                    break;
                case 4:
                    list.display();
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
