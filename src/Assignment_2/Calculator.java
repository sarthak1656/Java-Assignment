package Assignment_2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter first number:");
        double num1 = scanner.nextDouble();
        
        System.out.println("Enter an operator (+, -, *, /, %, ^2 (square), ^3 (cube), sqrt (square root)):");
        String operator = scanner.next();
        
        double result = 0;

        switch (operator) {
            case "+":
                System.out.println("Enter second number:");
                double num2 = scanner.nextDouble();
                result = num1 + num2;
                break;
            case "-":
                System.out.println("Enter second number:");
                num2 = scanner.nextDouble();
                result = num1 - num2;
                break;
            case "*":
                System.out.println("Enter second number:");
                num2 = scanner.nextDouble();
                result = num1 * num2;
                break;
            case "/":
                System.out.println("Enter second number:");
                num2 = scanner.nextDouble();
                result = num1 / num2;
                break;
            case "%":
                System.out.println("Enter second number:");
                num2 = scanner.nextDouble();
                result = num1 % num2;
                break;
            case "^2":
                result = Math.pow(num1, 2);
                break;
            case "^3":
                result = Math.pow(num1, 3);
                break;
            case "sqrt":
                result = Math.sqrt(num1);
                break;
            default:
                System.out.println("Invalid operator.");
                return;
        }

        System.out.println("Result: " + result);
        
        scanner.close();
    }
}


// Enter first number:
// 5
// Enter an operator (+, -, *, /, %, ^2 (square), ^3 (cube), sqrt (square root)):
// ^2
// Result: 25.0
