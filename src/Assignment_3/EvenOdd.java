public class EvenOdd {
    public static void main(String[] args) {
        int[] numbers = { 10, 15, 22, 37, 44 };

        System.out.println("Even numbers:");
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }

        System.out.println("\nOdd numbers:");
        for (int num : numbers) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
    }
}

// Even numbers:
// 10 22 44 
// Odd numbers:
// 15 37
