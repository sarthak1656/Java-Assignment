package Assignment4;

import java.util.Scanner;

public class PrimeRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of prime numbers: ");
        int n = sc.nextInt();
        System.out.println("The prime numbers between 1 and " + n + " are: ");
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;

                }

            }
            if (!isPrime) {
                continue;
            }

            System.out.println(i);
        }

    }
} 



// Enter the range of prime numbers:
// 5
// The prime numbers between 1 and 5 are:
// 2
// 3
// 5