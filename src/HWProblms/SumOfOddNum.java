package HWProblms;

import java.util.*;

public class SumOfOddNum {

    public static int SumOfOddNo(int n) {
        int Sum = 0;
        for (int i = 1; i <= n; i += 2) {
            Sum += i;
        }
        return Sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter the number");
        int n = sc.nextInt();

        int result = SumOfOddNo(n);

        System.out.println("The sum of odd numbers up to " + n + " is: " + result);
        sc.close();
    }
}
