package Assignment_3;

import java.util.Scanner;

public class EvaluateY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a number (n): ");
        int n = sc.nextInt();
        int y;

        // Evaluating y using nested if
        if (n >= 0) {
            if (n == 0)
                y = 0;
            else
                y = 1;
        } else {
            y = -1;
        }

        // Displaying the result
        System.out.println("y = " + y);

        sc.close();
    }
}


// Enter a number (n): 5
// y = 1
