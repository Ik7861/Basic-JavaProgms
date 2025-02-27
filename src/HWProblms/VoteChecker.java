package HWProblms;

import java.util.*;

public class VoteChecker {

    public static int Age(int num) {
        if(num >= 18){
            System.out.println("Eligible for voting");
        }else{
            System.out.println("Not Eligible for voting");
        }
       return num;
     }
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter the number");
       int num = sc.nextInt();

       int Checker = Age(num);  
       System.out.println("Person is :"+ Checker);
        
       sc.close();
    }
}
