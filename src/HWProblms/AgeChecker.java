package HWProblms;

import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter age (1-100): ");
        int age = sc.nextInt();

        // Check if age is within the valid range
        if (age >= 1 && age <= 100) {
            System.out.println(age + " years old");
        } else {
            System.out.println("Invalid age! Please enter a number between 1 and 100.");
        }
        
        sc.close();
    }
}
