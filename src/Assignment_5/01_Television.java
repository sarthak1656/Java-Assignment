package Assignment_5;
public class Television {
    String make;
    double screenSize;
    String dateOfPurchase;
    boolean isColorTV;

    // Constructor
    public Television(String make, double screenSize, String dateOfPurchase, boolean isColorTV) {
        this.make = make;
        this.screenSize = screenSize;
        this.dateOfPurchase = dateOfPurchase;
        this.isColorTV = isColorTV;
    }

    // Display method
    public void displayInfo() {
        System.out.println("Make: " + make);
        System.out.println("Screen Size: " + screenSize + " inches");
        System.out.println("Date of Purchase: " + dateOfPurchase);
        System.out.println("Color TV: " + (isColorTV ? "Yes" : "No"));
    }

    // Main method for testing
    public static void main(String[] args) {
        Television tv = new Television("Sony", 42.5, "2023-08-21", true);
        tv.displayInfo();
    }
}


// Make: Sony
// Screen Size: 42.5 inches
// Date of Purchase: 2023-08-21
// Color TV: Yes