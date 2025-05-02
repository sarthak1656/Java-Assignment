package midsem;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 5; // Length of the Fibonacci series
        int a = 0, b = 1, c;

        System.out.print("Fibonacci Series: " + a + " " + b);

        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    //  static int fibonacci(int n) {
    //     if (n == 0) return 0;           // base case
    //     if (n == 1) return 1;           // base case
    //     return fibonacci(n - 1) + fibonacci(n - 2);  // recursive case
    // }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     System.out.print("Enter the number of terms: ");
    //     int terms = sc.nextInt();

    //     System.out.println("Fibonacci Series up to " + terms + " terms:");
    //     for (int i = 0; i < terms; i++) {
    //         System.out.print(fibonacci(i) + " ");
    //     }

    //     sc.close();
    // }

    
    }
    
}
