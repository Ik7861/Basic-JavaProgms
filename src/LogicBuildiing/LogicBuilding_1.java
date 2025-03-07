package LogicBuildiing;

import java.util.Scanner;

public class LogicBuilding_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter strings (max length 15) followed by an integer (0-999):");

        while (sc.hasNext()) {
            String word = sc.next();  // Read the string
            int number = sc.nextInt();  // Read the integer
            
            // Print the formatted output
            System.out.printf("%-15s%03d%n", word, number);
        }
        
        sc.close();
    }
}
