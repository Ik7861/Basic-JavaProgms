package HWProblms;

import java.util.*;

public class ArrayNames {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        sc.nextLine();
        String[] names = new String[size];
       

        //input
        for(int i=0; i<names.length; i++){
            names[i] = sc.nextLine();
        }
       
        //output
        for(int i=0; i<names.length; i++){
            System.out.println(names[i]);
        }
        sc.close();
    }
}
