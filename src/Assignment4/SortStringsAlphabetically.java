import java.util.*;

public class SortStringsAlphabetically {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        String[] strings = new String[n];

        // Taking input
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            strings[i] = sc.nextLine();
        }

        // Sorting
        Arrays.sort(strings);

        // Displaying sorted strings
        System.out.println("\nStrings in alphabetical order:");
        for (String str : strings) {
            System.out.println(str);
        }
    }
}
