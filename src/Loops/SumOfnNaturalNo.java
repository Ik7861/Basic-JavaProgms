package Loops;

import java.util.*;

public class SumOfnNaturalNo 
{
    // Ex: n=4 ==> 1+2+3+4=10
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i=0;i<=n;i++)
        {
          sum = sum +i;
        }
        System.out.println(sum);

        sc.close();
    }
    
}
