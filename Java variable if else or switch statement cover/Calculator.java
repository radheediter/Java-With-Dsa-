import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Enter the operation: add, sub, multiply, or modulo");
        Scanner operationScanner = new Scanner(System.in);
        String operation = operationScanner.nextLine();

        System.out.println("Enter the first number:");
        int a = operationScanner.nextInt();

        System.out.println("Enter the second number:");
        int b = operationScanner.nextInt();

        switch (operation.toLowerCase()) {
            case "add":
                System.out.println("Result: " + (a + b));
                break;
            case "sub":
                System.out.println("Result: " + (a - b));
                break;
            case "multiply":
                System.out.println("Result: " + (a * b));
                break;
            case "modulo":
                if (b != 0) {
                    System.out.println("Result: " + (a % b));
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;
            default:
                System.out.println("Invalid operation");
                break;
        }
    }
}
