import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100]; // initial size
        int n = 0; // current size of array

        boolean repeat = true;

        while (repeat) {
            System.out.println("\nMenu:");
            System.out.println("1. Insertion at any given position");
            System.out.println("2. Deletion at any given position");
            System.out.println("3. Linear Search");
            System.out.println("4. Binary Search");
            System.out.println("5. Sort");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
               outer: for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 3) {
                    System.out.println("break outer");
                    break outer;
                }
                System.out.println(i + " " + j);
            }
        }         case 1:
                    System.out.print("Enter element to insert: ");
                    int elem = sc.nextInt();
                    System.out.print("Enter position (0 to " + n + "): ");
                    int pos = sc.nextInt();
                    if (pos < 0 || pos > n) {
                        System.out.println("Invalid position!");
                    } else {
                        for (int i = n; i > pos; i--) {
                            arr[i] = arr[i - 1];
                        }
                        arr[pos] = elem;
                        n++;
                        System.out.println("Element inserted.");
                    }
                    break;

                case 2:
                    System.out.print("Enter position to delete (0 to " + (n - 1) + "): ");
                    int delPos = sc.nextInt();
                    if (delPos < 0 || delPos >= n) {
                        System.out.println("Invalid position!");
                    } else {
                        for (int i = delPos; i < n - 1; i++) {
                            arr[i] = arr[i + 1];
                        }
                        n--;
                        System.out.println("Element deleted.");
                    }
                    break;

                case 3:
                    System.out.print("Enter element to search (linear search): ");
                    int searchElem = sc.nextInt();
                    boolean found = false;
                    for (int i = 0; i < n; i++) {
                        if (arr[i] == searchElem) {
                            System.out.println("Element found at index " + i);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Element not found.");
                    }
                    break;

                case 4:
                    Arrays.sort(arr, 0, n); // sort before binary search
                    System.out.print("Enter element to search (binary search): ");
                    int binaryElem = sc.nextInt();
                    int low = 0, high = n - 1, mid;
                    boolean foundBinary = false;
                    while (low <= high) {
                        mid = (low + high) / 2;
                        if (arr[mid] == binaryElem) {
                            System.out.println("Element found at index " + mid);
                            foundBinary = true;
                            break;
                        } else if (arr[mid] < binaryElem) {
                            low = mid + 1;
                        } else {
                            high = mid - 1;
                        }
                    }
                    if (!foundBinary) {
                        System.out.println("Element not found.");
                    }
                    break;

                case 5:
                    Arrays.sort(arr, 0, n);
                    System.out.println("Array sorted: ");
                    for (int i = 0; i < n; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

            System.out.print("Do you want to continue? (yes/no): ");
            sc.nextLine(); // consume leftover newline
            String response = sc.nextLine().trim().toLowerCase();
            if (!response.equals("yes")) {
                repeat = false;
            }
        }

        sc.close();
        System.out.println("Program exited.");
    }
}
   