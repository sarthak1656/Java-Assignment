package Assignment_3;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the student's marks (0-100): ");
        int marks = sc.nextInt();

        // Checking the grade based on marks
        if (marks >= 80 && marks <= 100)
            System.out.println("Grade: Honour");
        else if (marks >= 60 && marks <= 79)
            System.out.println("Grade: 1st Division");
        else if (marks >= 50 && marks <= 59)
            System.out.println("Grade: 2nd Division");
        else if (marks >= 40 && marks <= 49)
            System.out.println("Grade: 3rd Division");
        else if (marks >= 0 && marks <= 39)
            System.out.println("Grade: Fail");
        else
            System.out.println("Invalid marks! Please enter a number between 0 and 100.");

        sc.close();
    }
}


// Enter the student's marks (0-100): 50
// Grade: 2nd Division