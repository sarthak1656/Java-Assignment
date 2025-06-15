import java.util.Scanner;

public class FindChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
       String str = sc.nextLine();
       System.out.println("enter character to find: ");
       char ch = sc.nextLine().charAt(0);

       int index = str.indexOf(ch);
        System.out.println("Index: " + index);
    }
}
