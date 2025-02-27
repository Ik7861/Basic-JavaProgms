package Arrays;

import java.util.*;

public class SampleArray {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // int marks[] = new int[3];
        // int[] marks = new int[3];
        int[] marks = {97,98,95};//if we already know values 
        // marks[0] = 97;
        // marks[1] = 98;
        // marks[2] = 95;
       
        for(int i=0; i<3; i++){
            System.out.println(marks[i]);
        }
        sc.close();
    }
    
}
