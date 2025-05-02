public class Factorial {
    public static void main(String[] args) {
        int n = 5;

        System.out.println("Non-recursive:");
        int fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        System.out.println(fact);

        System.out.println("Recursive:");
        System.out.println(factRec(n));
    }

    static int factRec(int n) {
        if (n == 0) return 1;
        return n * factRec(n - 1);
    }
}
