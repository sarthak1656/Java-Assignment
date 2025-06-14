package Assignment_5;

public class Stack {
    int[] stack = new int[10]; // fixed semicolon
    int top = -1;              // fixed semicolon

    void push(int val) {
        if (top == stack.length - 1) {
            System.out.println("Stack overflow"); // fixed quotes
        } else {
            stack[++top] = val; // fixed semicolon
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack underflow"); // fixed quotes
        } else {
            System.out.println("Popped: " + stack[top--]); // fixed quotes and spelling
        }
    }

    void peep() {
        if (top == -1) {
            System.out.println("Stack underflow"); // fixed quotes
        } else {
            System.out.println("Top element: " + stack[top]); // fixed quotes
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.pop();
        s.peep();
    }
}
