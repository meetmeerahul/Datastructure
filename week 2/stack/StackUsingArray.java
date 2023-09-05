import java.util.Scanner;

public class StackUsingArray {
  int top;
  int max_size = 10;

  int[] arr = new int[max_size];

  StackUsingArray() {
    top = -1;
  }

  boolean push(Scanner sc) {
    if (top == max_size - 1) {
      System.out.println("Overflow !!");
      return false;
    } else {
      System.out.println("Enter Value :");
      int val = sc.nextInt();
      top++;
      arr[top] = val;
      System.out.println("element pushed into array !!");
      return true;
    }
  }

  public boolean show() {

    if (top == -1) {
      System.out.println("Stack is empty !!");
      return false;
    }

    for (int i = 0; i <= top; i++) {
      System.out.print(" " + arr[i]);
    }
    return true;
  }

  public boolean pop() {

    if (top == -1) {

      System.out.println("Underflow !!!");
      return false;
    } else {

      top -= 1;
      System.out.println("Item Poped ");
      return true;

    }

  }

  public int peek(){


    if(top ==-1){
      System.out.println("Underflow");
      return 0;
    }

    else{
      return arr[top-1];
    }
   
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StackUsingArray stack = new StackUsingArray();
    int choice;

    boolean key = true;

    while (key) {
      System.out.println();
      System.out.println("1.Push()");
      System.out.println("2.Pop()");
      System.out.println("3.Display()");
      System.out.println("4.Peek");
      System.out.println("5.Exit()");
      System.out.println("Enter an option : ");
      choice = sc.nextInt();

      switch (choice) {
        case 1:
          stack.push(sc);
          break;
        case 2:
          stack.pop();
          break;
        case 3:
          stack.show();
          break;
        case 4:
         System.out.println("arrat[top] : "+stack.peek()); 
          break;
        case 5:
          key = false;
          break;
        default:
          System.out.println("Invalid option");
      }
    }
  }
}
