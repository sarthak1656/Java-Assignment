package Assignment4;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print its multiplication table: ");
        int n = sc.nextInt();

        System.out.println("using while loop:");
        int i = 1;
        while (i <= 10) {
            System.out.println(n + " x " + i + " = " + (n * i));
            i++;
        }

        System.out.println();

        System.out.println("using do while loop:");
        int j = 1;
        do {
            System.out.println(n + " x " + j + " = " + (n * j));
            j++;
        } while (j <= 10);

        System.out.println();

        System.out.println("using for loop:");
        for (int k = 1; k <= 10; k++) {
            System.out.println(n + " x " + k + " = " + (n * k));
        }
    }
}


// using for loop:
// 5 x 1 = 5
// 5 x 2 = 10
// 5 x 3 = 15
// 5 x 4 = 20
// 5 x 5 = 25
// 5 x 6 = 30
// 5 x 7 = 35
// 5 x 8 = 40
// 5 x 9 = 45
// 5 x 10 = 50

