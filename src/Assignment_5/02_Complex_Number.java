package Assignment_5;

public class Complex_Number {
    int real;
    int img;

    // Default constructor
    public Complex_Number() {
        real = 0;
        img = 0;
    }

    // Parameterized constructor
    public Complex_Number(int r, int i) {
        real = r;
        img = i;
    }

    // Copy constructor
    public Complex_Number(Complex_Number c) {
        this.real = c.real;
        this.img = c.img;
    }

    // Method to add two complex numbers
    public Complex_Number sum(Complex_Number c2) {
        Complex_Number result = new Complex_Number();
        result.real = this.real + c2.real;
        result.img = this.img + c2.img;
        return result;
    }

    // Display method
    public void display() {
        System.out.println(real + " + " + img + "i");
    }

    public static void main(String[] args) {
        Complex_Number c1 = new Complex_Number(3, 2);
        Complex_Number c2 = new Complex_Number(1, 4);
        Complex_Number c3 = c1.sum(c2);

        System.out.print("First number: ");
        c1.display();

        System.out.print("Second number: ");
        c2.display();

        System.out.print("Sum: ");
        c3.display();
    }
}

// First number: 3 + 2i
// Second number: 1 + 4i
// Sum: 4 + 6i
