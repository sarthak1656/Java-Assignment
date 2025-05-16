package Assignment_5;

class MessageClass {
    MessageClass() {
        System.out.println("Default constructor called!");
    }

    MessageClass(String msg) {
        System.out.println("Message: " + msg);
    }

    public static void main(String[] args) {
        MessageClass obj1 = new MessageClass();
        MessageClass obj2 = new MessageClass("Hello from overloaded constructor!");
    }
}

// Default constructor called!
// Message: Hello from overloaded constructor!

