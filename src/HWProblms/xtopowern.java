package HWProblms;

import java.util.*;

public class xtopowern {
    
    public static double Value(double x, double n) {
        if (n < 0) {
            x = 1/x;
            n = Math.abs(n);
        }

        double result = 1;
         
        for (int i = 0; i < n; i++) {
            result *= x;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            
        System.out.print("Enter the base number (x): ");  // Fixed colon position and changed println to print
        double x = sc.nextDouble();
        
        System.out.print("Enter the power (n): ");  // Added input for n
        double n = sc.nextDouble();
        
        double result = Value(x, n);  // Call the Value method
        System.out.println(x + " raised to power " + n + " is: " + result);
        
        sc.close();  // Close the scanner
    }
}
