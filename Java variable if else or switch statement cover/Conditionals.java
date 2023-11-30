import java.util.*;

public class Conditionals {
    public static void main(String[] args) {

        // This Program may use to find odd or even number
        // If 3 is an Odd Number , print "Bazinga"

        // System.out.println("Enter The Number:");
        // Scanner sc = new Scanner(System.in);
        // int Number = sc.nextInt();
        // int Divisible = (Number%2);
        // if (Divisible == 0) {
        // System.out.println("Even");
        // } else {
        // System.out.println("Bazinga");
        // }

        // This Program May use to find Equal to or greater then or less then in program

        // System.out.println("Enter The Numbers :");
        // Scanner gl = new Scanner(System.in);
        // int Number1 = gl.nextInt();
        // int Number2 = gl.nextInt();
        // if (Number1 == Number2) {
        // System.out.println("Equal");
        // } else if (Number1 > Number2) {
        // System.out.println("Number 1 is Greater Then Number 2");
        // } else {
        // System.out.println("Number 2 is Greater Then Number 1");
        // }

        // button if else print Hello, Namaste, Bonjoure By Pressing Button On Keybord

        // System.out.println("Enter The Number: ");
        // Scanner input = new Scanner(System.in);
        // int EnterNumber = input.nextInt();
        // if (EnterNumber == 1) {
        // System.out.println("Hello World");
        // } else if (EnterNumber == 2) {
        // System.out.println("Namaste Bharat");
        // } else if (EnterNumber == 3) {
        // System.out.println("Bonjoure");
        // } else {
        // System.out.println("You Pressed Wrong Keys");
        // }

        // Let's Do THe Upper Program WIth Switch Statement
        System.out.println("Enter The Number: ");
        Scanner Keyvalue = new Scanner(System.in);
        int Button = Keyvalue.nextInt();
        switch (Button) {
            case 1:
                System.out.println("Hello World");
                break;
            case 2:
                System.out.println("Namaste Bharat");
                break;
            case 3:
                System.out.println("Bonjoure");
                break;

            default:
                break;
        }
    }
}
