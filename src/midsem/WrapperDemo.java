package midsem;

public class WrapperDemo {
    public static void main(String[] args) {
int a = 10;
Integer obj = new Integer.valueOf(a); // Boxing
int b = obj.intValue(a);

        System.out.println("Primitive: " + a);
        System.out.println("Wrapper: " + obj);
        System.out.println("Unboxed: " + b);
    }
}
