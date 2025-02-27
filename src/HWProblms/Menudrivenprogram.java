package HWProblms;

import java.util.Scanner;

public class Menudrivenprogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        do {
            System.out.println("Enter 1 to input marks or 0 to stop:");
            num = sc.nextInt();

            if (num == 1) {
                System.out.println("Enter marks (out of 100):");
                int Marks = sc.nextInt();

                if (Marks >= 90) {
                    System.out.println("This is Good");
                } else if (Marks >= 60) {
                    System.out.println("This is also Good");
                } else if (Marks >= 0) {
                    System.out.println("This is Good as well");
                } else {
                    System.out.println("Invalid marks! Please enter marks between 0 and 100.");
                }
            } else if (num != 0) {
                System.out.println("Invalid input! Please enter 1 or 0.");
            }
        } while (num != 0);

        sc.close();
        System.out.println("Program stopped. Thank you!");
    }
}
