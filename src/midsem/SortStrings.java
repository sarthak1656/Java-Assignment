package midsem;
import java.util.*;

public class SortStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[5];

        System.out.println("Enter 5 strings:");
        for (int i = 0; i < 5; i++) arr[i] = sc.nextLine();

        Arrays.sort(arr);
        System.out.println("Sorted strings:");
        for (String s : arr) System.out.println(s);
    }
}
