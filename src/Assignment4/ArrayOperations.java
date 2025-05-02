import java.util.*;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int size = 0;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Search");
            System.out.println("4. Sort");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter element to insert: ");
                    int val = sc.nextInt();
                    System.out.print("Enter position: ");
                    int pos = sc.nextInt();
                    for (int i = size; i > pos; i--) arr[i] = arr[i - 1];
                    arr[pos] = val;
                    size++;
                    System.out.println("Inserted.");
                }
                case 2 -> {
                    System.out.print("Enter position to delete: ");
                    int pos = sc.nextInt();
                    for (int i = pos; i < size - 1; i++) arr[i] = arr[i + 1];
                    size--;
                    System.out.println("Deleted.");
                }
                case 3 -> {
                    System.out.print("Enter element to search: ");
                    int key = sc.nextInt();
                    // Linear Search
                    boolean found = false;
                    for (int i = 0; i < size; i++) {
                        if (arr[i] == key) {
                            System.out.println("Found at index " + i + " using Linear Search.");
                            found = true;
                            break;
                        }
                    }
                    if (!found) System.out.println("Not found.");

                    // Binary Search
                    Arrays.sort(arr, 0, size);
                    int res = Arrays.binarySearch(arr, 0, size, key);
                    System.out.println("Binary Search result: " + (res >= 0 ? "Found at index " + res : "Not found"));
                }
                case 4 -> {
                    Arrays.sort(arr, 0, size);
                    System.out.println("Sorted array:");
                    for (int i = 0; i < size; i++) System.out.print(arr[i] + " ");
                    System.out.println();
                }
                case 5 -> System.exit(0);
            }

            System.out.print("Do you want to continue? (yes/no): ");
            if (!sc.next().equalsIgnoreCase("yes")) break;
        }
    }
}
