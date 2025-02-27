package HWProblms;

public class GCDRecursive {
    // Recursive function to find GCD
    public static int findGCD(int a, int b) {
        if (b == 0)
            return a;
        return findGCD(b, a % b);
    }

    public static void main(String[] args) {
        int num1 = 56, num2 = 98;
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + findGCD(num1, num2));
    }
}

// Explanation
// The findGCD function uses a loop to apply the Euclidean Algorithm.
// In each iteration:
// b becomes a % b
// a takes the value of b
// This continues until b == 0, at which point a holds the GCD.
// The main method calls findGCD with num1 = 56 and num2 = 98 and prints the result.
