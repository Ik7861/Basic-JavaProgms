package HWProblms;

import java.util.*;

public class findLargest {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("Enter the number to Find Largest number");
        if(a > b && a > c){
            System.out.println( "a is greater");
        } else if(b > a && b > c){
            System.out.println("b is greater");
        } else if(c > a && c > b ){
            System.out.println("c is greater");
        }
        

        sc.close();
    }
}
