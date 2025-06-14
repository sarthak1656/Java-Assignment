package Assignment_5;

// public class Message {
//     Message() {
//         System.out.println("Default constructor called.");
//     }

//     public static void main(String[] args) {
//         Message obj = new Message();
//     }
// }

// Default constructor called.

public class Message {
    Message() {
        System.out.println("Default constructor called.");
    }

    Message(String msg) {
        System.out.println("Message: " + msg);
    }

    public static void main(String[] args) {
        Message obj1 = new Message();
        Message obj2 = new Message("Hello from overloaded constructor!");
    }
}

// Default constructor called.
// Message: Hello from overloaded constructor!
