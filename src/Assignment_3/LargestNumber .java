package Assignment_3;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        // Finding the largest using nested if conditions
        int largest;

        if (a > b) {
            if (a > c) {
                largest = a;
            } else {
                largest = c;
            }
        } else {
            if (b > c) {
                largest = b;
            } else {
                largest = c;
            }
        }

        // Display the result
        System.out.println("The largest number is: " + largest);
        sc.close();
    }
}

// Enter first number: 5
// Enter second number: 1
// Enter third number: 2
// The largest number is: 5