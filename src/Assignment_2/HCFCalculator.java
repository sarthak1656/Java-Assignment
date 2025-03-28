//wap to take a set of numbers from the user input to find the HCF of those numbers.

package Assignment_2;

import java.util.Scanner;

public class HCFCalculator {
    // Method to find HCF using Euclidean Algorithm
    public static int findHCF(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking for the number of elements
        System.out.print("Enter the number of elements (at least 2): ");
        int n = scanner.nextInt();

        // Validate input
        if (n < 2) {
            System.out.println("Please enter at least 2 numbers for HCF calculation.");
            scanner.close();
            return;
        }

        System.out.println("Enter the numbers:");
        int hcf = scanner.nextInt();

        for (int i = 1; i < n; i++) {
            int num = scanner.nextInt();
            hcf = findHCF(hcf, num);
        }

        System.out.println("HCF: " + hcf);
        scanner.close();
    }
}


// Enter the number of elements (at least 2): 3
// Enter the numbers:
// 2 4 6
// HCF: 2