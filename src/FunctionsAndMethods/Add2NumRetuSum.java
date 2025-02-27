package FunctionsAndMethods;

import java.util.*;

public class Add2NumRetuSum {

    public static int CalculateSum(int a, int b){

       int sum = a + b;
        return sum;
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

       int sum = CalculateSum(a, b);
       System.out.println("sum of two number is : "+ sum);

       sc.close();
    }

}
