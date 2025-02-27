package HWProblms;

import java.util.*;

public class UserInput {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int positiveCount=0, negativeCount=0, zeroCount=0;

        while(true){
            System.out.println("Enter the number(or)Type 'exit' to stop:");
        
        if(sc.hasNextInt()){
            int num = sc.nextInt();


            if (num>0){
                positiveCount++;
            }else if(num<0){
                negativeCount++;
            } else {
                zeroCount++;
            } 
            
        } else {
            String intput = sc.next();
            if (intput.equalsIgnoreCase("exit")){
                break;
            
            } else{
                System.out.println("Invalid input! please enter the number or 'exit'.");
            }
            }
            }
          
        
            System.out.println("\nSummary:");
            System.out.println("Positive numbers: " + positiveCount);
            System.out.println("Negative numbers: " + negativeCount);
            System.out.println("Zeros: " + zeroCount);
    
        sc.close();
    
    }
    
}
