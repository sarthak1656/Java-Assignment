public class WrapperDemo {
    public static void main(String[] args) {
        int a = 10;
        Integer obj = Integer.valueOf(a); // Autoboxing
        int b = obj.intValue();           // Unboxing

        System.out.println("Wrapper Object: " + obj);
        System.out.println("Primitive int: " + b);
    }
}
