import java.util.*;

public class Marks {
    public static void main(String[] args) {
        // Creating Two Variable Choice or Marks
        int choice;
        int marks;
        // Using Scanner module for scan the input form user
        Scanner number = new Scanner(System.in);

        // Using Do While Loop for The Choice of User
        do {
            System.err.println("Enter 1 To input marks or 0 To Stop: ");
            choice = number.nextInt();

            // Checking The User Input and running on the basses of 0 stop 1 to run
            if (choice == 1) {
                // Take Input for student's Marks
                System.out.println("Enter student's marks (out of 100):");
                marks = number.nextInt();
                // Check and print message based on marks
                if (marks >= 90) {
                    System.out.println("This is Good");
                } else if (marks >= 60 && marks <= 89) {
                    System.out.println("This is also Good");
                } else if (marks >= 0 && marks <= 50) {
                    System.out.println("This is Good as well");
                } else {
                    System.out.println("Invalid marks entered");
                }
            } else if (choice != 0) {
                System.out.println("Invalid Choice. Please enter either 1 or 0");
            }
        } while (choice != 0);

    }
}
