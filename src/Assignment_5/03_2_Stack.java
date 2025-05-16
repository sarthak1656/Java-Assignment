package Assignment_5;

public class Stack{int[]arr=new int[5];int top=-1;

void push(int val){if(top==4){System.out.println("Stack Overflow");}else{arr[++top]=val;}}

void pop(){if(top==-1){System.out.println("Stack Underflow");}else{System.out.println("Popped: "+arr[top--]);}}

void peep(){if(top==-1){System.out.println("Stack is empty");}else{System.out.println("Top element: "+arr[top]);}}

public static void main(String[]args){Stack s=new Stack();s.push(10);s.push(20);s.peep();s.pop();s.peep();}}


// Top element: 20
// Popped: 20
// Top element: 10