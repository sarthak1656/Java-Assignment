package Assignment4;

import java.util.Scanner;

public class practice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int n;
        System.out.println("Enter the number of elements: ");
        n = sc.nextInt();
        System.out.println("enter elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter element to insert");
        int elem = sc.nextInt();

        System.out.println("Enter position to insert(0 to 99): ");
        int pos = sc.nextInt();

        if (pos < 0 || pos > n ) {
            System.out.println("Invalid position");
        } else {
            for (int j = n; j > pos; j--) {
                arr[j] = arr[j - 1];
            }
            arr[pos] = elem;
            n++;
            System.out.println("array after insertion");
            for (int k = 0; k < n; k++) {
                System.out.println(arr[k]);
            }
        }

    }

}