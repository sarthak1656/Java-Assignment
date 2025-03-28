package Assignment_2;

import java.util.Scanner;

public class PriceToPaisa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the price in rupees (decimal form):");
        double price = scanner.nextDouble();

        int paisa = (int) (price * 100);

        System.out.println("Price in paisa: " + paisa);

        scanner.close();
    }
}

// Enter the price in rupees (decimal form):
// 56
// Price in paisa: 5600
