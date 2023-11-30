import java.util.*;

public class Month {
    public static void main(String[] args) {
        System.out.println("Enter The Month Between 1 To 12");
        Scanner month = new Scanner(System.in);
        int Number_of_months = month.nextInt();

        switch (Number_of_months) {
            case 1:
                System.out.println("Jananuary");
                break;
            case 2:
                System.out.println(" February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("Agust");
                break;
            case 9:
                System.out.println("Spetember");
                break;
            case 10:
                System.out.println("Octuber");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
                
            default:
                break;
        }
    }

}
