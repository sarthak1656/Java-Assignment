package Assignment4;

public class LabelDemo {
    public static void main(String[] args) {
        outer:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    break outer;
                }
                System.out.println(i + " " + j);
            }
        }
    }
}

// 1 1
// 1 2
// 1 3
// 2 1
 
