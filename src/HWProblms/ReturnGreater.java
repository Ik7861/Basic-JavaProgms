package HWProblms;

import java.util.*;

public class ReturnGreater {

    // Function to return the greater of two numbers
    public static int ReturnGreaterNo(int n1, int n2) {
        return (n1 > n2) ? n1 : n2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int result = ReturnGreaterNo(n1, n2);
        System.out.println("The greater number is: " + result);

        sc.close();
    }
}
