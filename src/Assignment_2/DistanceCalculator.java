
// the total distance travelled by a vehicle is given by distance ut+at2 / 2 where u is the initial velocity, a is the acceleration and t is the time. wap to calculate the distance travelled in a regular time given by the value of u and a and time

package Assignment_2;

import java.util.Scanner;

public class DistanceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter initial velocity (u): ");
        double u = scanner.nextDouble();
        
        System.out.println("Enter acceleration (a): ");
        double a = scanner.nextDouble();
        
        System.out.println("Enter time (t): ");
        double t = scanner.nextDouble();
        
        double distance = (u * t) + (0.5 * a * t * t);
        
        System.out.println("Distance traveled: " + distance);
        
        scanner.close();
    }
}

// Enter initial velocity (u): 
// 12
// Enter acceleration (a): 
// 5.0
// Enter time (t): 
// 3
// Distance traveled: 58.5