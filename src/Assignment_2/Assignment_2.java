package Assignment_2;
import java.util.Scanner;

public class Assignment_2 {

    public static void main(String[] args) {

        // 1. wap to take a set of numbers from input line as marks of the student,
        // calculate the total mark and the average mark secured by each student.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the marks of the student separated by spaces:");
        String input = scanner.nextLine();

        String[] marksArray = input.split(" ");
        int totalMarks = 0;
        int numberOfSubjects = marksArray.length;

        for (int i = 0; i < numberOfSubjects; i++) {
        totalMarks += Integer.parseInt(marksArray[i]);
        }

        double averageMarks = (double) totalMarks / numberOfSubjects;

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);

        // ---------------------------------------------------------------------------------

    }
}
