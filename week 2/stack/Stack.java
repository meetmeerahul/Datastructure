public class Stack {

    int top;
    int copy_top;

    int max = 10;

    char[] arr = new char[max];

    char[] copy = new char[max];

    Stack() {
        top = -1;
        copy_top = 0;
    }

    public void push(char i) {

        if (top != max - 1) {

            top++;
            arr[top] = i;
        }

        else {
            System.out.println("Over flow");
        }

    }

    public void display() {

        if (top == -1) {

            System.out.println("Stack is empty");
        }

        else {

            for (int i = 0; i <= top; i++) {
                System.out.println(arr[i]);
            }
        }
    }

    public void reverse() {

        for (int i = 0; i <= top; i++) {
            char el = arr[i];
            copy[copy_top] = el;
            copy_top++;
        }

            while (top > -1) {

                System.out.println(copy[top]);
                top--;
            }
        

    }

    public static void main(String[] args) {

        Stack stack = new Stack();
        stack.display();
        stack.push('R');
        stack.push('A');
        stack.push('H');
        stack.push('U');
        stack.push('L');

        // stack.display();

        stack.reverse();

    }

}
