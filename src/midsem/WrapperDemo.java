package midsem;

public class WrapperDemo {
    public static void main(String[] args) {
        int a = 10;
        Integer obj = Integer.valueOf(a); // boxing
        int b = obj.intValue(); // unboxing

        System.out.println("Primitive: " + a);
        System.out.println("Wrapper: " + obj);
        System.out.println("Unboxed: " + b);
    }
}

