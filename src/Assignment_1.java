// import java.util.Scanner;

// public class Assignment_1 {
//     public static void main(String[] args) {
//         // 1. wap to find out sum,substraction,multiplication and division
//         Scanner s = new Scanner(System.in);
//         System.out.println("Enter two numbers: ");
//         int a = s.nextInt();
//         int b = s.nextInt();
//         System.out.println("Addition of "+a+" and "+b+" is: "+(a+b));
//         System.out.println("Substraction of "+a+" and "+b+" is: "+(a-b));
//         System.out.println("Multiplication of "+a+" and "+b+" is: "+(a*b));
//         System.out.println("Division of "+a+" and "+b+" is: "+(a/b));

//         // ---------------------------------------------------------------------------

//         // 2.wap to print area and perimeter of a circle
//         Scanner s = new Scanner(System.in);
//         System.out.println("Enter the radius of the circle: ");
//         double r = s.nextDouble();

//         double area = Math.PI * (r * r);
//         double peri = 2 * Math.PI * r;
//         System.out.println("Area of the circle is: " + area);
//         System.out.println("Perimeter of the circle is: " + peri);

//         // -----------------------------------------------------------------------

//         // 3.wap to print american flag.
//         // System.out.println("* * * * * * ==============================");
//         // System.out.println(" * * * * * ==============================");
//         // System.out.println("* * * * * * ==============================");
//         // System.out.println(" * * * * * ==============================");
//         // System.out.println("* * * * * * ==============================");
//         // System.out.println(" * * * * * ==============================");
//         // System.out.println("* * * * * * ==============================");
//         // System.out.println(" * * * * * ==============================");
//         // System.out.println("* * * * * * ==============================");
//         // System.out.println("==========================================");
//         // System.out.println("==========================================");
//         // System.out.println("==========================================");
//         // System.out.println("==========================================");
//         // System.out.println("==========================================");
//         // System.out.println("==========================================");

//         // ------------------------------------------------------------------------------

//         // 4.wap to swap two numbers.
//         Scanner s = new Scanner(System.in);
//         System.out.println("Enter two numbers a and b: ");
//         int a = s.nextInt();
//         int b = s.nextInt();

//         System.out.println("\nBefore swapping the value of a: " + a);
//         System.out.println("Before swapping the value of b: " + b);

//         a = a ^ b;
//         b = a ^ b;
//         a = a ^ b;

//         System.out.println("\nAfter swapping the value of a: " + a);
//         System.out.println("After swapping the value of b: " + b);

//         // --------------------------------------------------------------------

//         // 5.wap to print smily and sad face

//         // System.out.println(" ");
//         // System.out.println(" ** ** ");
//         // System.out.println(" **** **** ");
//         // System.out.println(" ** ** ");
//         // System.out.println(" ");
//         // System.out.println(" ");
//         // System.out.println(" * * ");
//         // System.out.println(" * * ");
//         // System.out.println(" * * ");
//         // System.out.println(" * * ");
//         // System.out.println(" * ");
//         // System.out.println(" ");

//         // -------------------------------------------------------------------

//         // 6. Wap to compare two number.
//         Scanner s = new Scanner(System.in);
//         System.out.println("Enter two numbers: ");
//         int a = s.nextInt();
//         int b = s.nextInt();
//         System.out.println(a > b);
//         System.out.println(a < b);
//         System.out.println(a == b);

//         // ----------------------------------------------------------------------

//         // 7.wap to compute hexagonal area.
//         Scanner s = new Scanner(System.in);
//         System.out.println("Enter the length of the side: ");
//         double side = s.nextDouble();
//         double area = ((3 * Math.sqrt(3)) / 2) * (side * side);

//         System.out.println("Area of the hexagone is: " + area);

//         // ---------------------------------------------------------------------------

//         // 8.wap to compute the distance between two points on earth surface.
//         Scanner s = new Scanner(System.in);
//         System.out.println("Enter the two points of the earth: ");
//         double a = s.nextDouble();
//         double b = s.nextDouble();
//         double distance = Math.abs(a-b);
//         System.out.println("The distance between two points are: " + distance);

//     }
// }
