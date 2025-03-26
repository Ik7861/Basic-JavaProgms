package Practice;

public class p1 {
    public static void main(String[] args) {
        // ✅ 1. Adding Natural Numbers from 1 to 20
        int sum = 0;
        for (int i = 1; i <= 20; i++) {
            sum += i; // Equivalent to sum = sum + i
        }
        System.out.println("Sum of natural numbers (1-20): " + sum);

        // ✅ 2. Multiplication Table of 5
        System.out.println("Multiplication Table of 5:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
        }

        // ✅ 3. Factorial of 5
        int n = 5;
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + n + " is: " + fact);

        // ✅ 4. Reverse a Number
        int num = 12343222;
        int reverse = 0;
        for (; num > 0; num /= 10) {
            int digit = num % 10;  // Extract last digit
            reverse = reverse * 10 + digit;  // Append digit to reverse
        }
        System.out.println("Reversed Number: " + reverse);
    }
}
