import java.util.*;


public class Even {
    public static void main(String[] args) {

        // Printing The Even Number of n natural Number
        
        Scanner evenNumber = new Scanner(System.in);
        int Number = evenNumber.nextInt();
        for(int i = 1; i<=Number ;i++){
            if(i%2==0){
                System.out.println(i+"");
            }
        }

        
        // This is Infinite Loop 

        // for(; ;) {
        //     System.out.println("Apna College");
        //     }
    }
}
