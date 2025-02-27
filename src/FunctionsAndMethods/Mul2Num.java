package FunctionsAndMethods;

import java.util.*;

public class Mul2Num {

    public static int CalculateMul(int a,int b){
       int Mul = ( a * b);
        return Mul ;

    } 
    public static void main(String arg[] ){
        Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
    int b = sc.nextInt();

       int Mul = CalculateMul(a,b);
       System.out.println(Mul);

        sc.close();

    }
    
}
