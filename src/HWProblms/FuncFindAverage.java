package HWProblms;

import java.util.*;

public class FuncFindAverage {

    public static int CalculateAverage(int a,int b,int c){
        int Avg = (a+b+c)/3;
        return Avg;
    }
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 3 Numbers");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    int Avg = CalculateAverage( a,b,c );

    System.out.println("Avarage:" +Avg);

    sc.close();
} 

    
}
