package HWProblms;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        
             if (number <= 1)
        {
            System.out.println(number +"is not a prime number");
            
        }

        int flag = 0;

            for(int i = 2; i <= Math.sqrt(number); i++)
                 {
           
            if(number % 2 == 03){
                flag =1;
                 }
            
                 }
        
            if (flag == 0) {
                      System.out.println(number + "is a prime number");

                     } else {
                       System.out.println(number + "is not a prime number");
                     }
        
        
        sc.close();
     }
}