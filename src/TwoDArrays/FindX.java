package TwoDArrays;

import java.util.*;

public class FindX {

    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();

        int col = sc.nextInt();

        int[][] numbers = new int[row][col];

        // input
        //rows
        for(int i = 0; i < row; i++) {
        //columns
            for(int j = 0; j < col; j++) {

                numbers[i][j] = sc.nextInt();
            }

        }

        //Find X
        int x = sc.nextInt();
        //output
        for(int i = 0; i < row; i++) {

            for(int j = 0; j < col; j++) {

                if(numbers[i][j] == x){

                System.out.println( "x found at (" + i + " " + j +")" );
            }
        
        }
         
        sc.close();

    }
    
    }
}
