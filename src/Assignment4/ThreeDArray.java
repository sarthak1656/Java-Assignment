import java.util.Scanner;

public class ThreeDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][][] arr = new int[2][2][2]; // 3D array with dimensions 2x2x2

        // Input
        System.out.println("Enter 8 elements for 2x2x2 3D array:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    System.out.print("Element [" + i + "][" + j + "][" + k + "]: ");
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }

        // Output
        System.out.println("\n3D Array Elements:");
        for (int i = 0; i < 2; i++) {
            System.out.println("Layer " + i + ":");
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
