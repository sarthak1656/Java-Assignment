package midsem;

import java.util.Scanner;

public class palindrome {
    static String rev(String str) {
        if (str.isEmpty()) {
            return str;
        } else {
            return rev(str.substring(1)) + str.charAt(0);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String rev = rev(str);
        if (str.equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
