package Assignment_3;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Checking leap year condition without using nested if
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
            System.out.println(year + " is a Leap Year.");
        else
            System.out.println(year + " is NOT a Leap Year.");

        sc.close();
    }
}


// Year	Output
// enter a year 
// 100	❌ NOT a Leap Year
// 200	❌ NOT a Leap Year
// 300	❌ NOT a Leap Year
// 2023	❌ NOT a Leap Year
// 2000	✅ Leap Year
// 10000	✅ Leap Year