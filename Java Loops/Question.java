import java.util.*;
// Print the Sum of N Natural Number in java

public class Question {
    public static void main(String[] args) {

        // Scanner n = new Scanner(System.in);
        // int Number =n.nextInt();
        // int sum = 0;
        // for(int i = 0; i<= Number ;i++){
        //     sum = sum + i;
        // }
        // System.out.println(sum);

        // This program find the area of a circle = pi*r*r, pi = 3.17;

        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter the radius of the circle: ");
        // double radius = scanner.nextDouble();

        // double pi = 3.14159;
        // double areaOfCircle = pi * radius * radius;

        // System.out.println("The area of the circle is: " + areaOfCircle);

        // Printing The Table That User Enterd:
        
        Scanner number = new Scanner(System.in);
        int Table = number.nextInt();
        int result;
        for( int i = 1; i<=10;i++){
            result = Table * i;
            System.out.println(result);
        }
    }
}
