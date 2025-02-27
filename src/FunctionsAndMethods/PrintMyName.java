package FunctionsAndMethods;

import java.util.*;

public class PrintMyName {

public static void PrintMyname (String name) {

System.out.println(name);

return ;
}


public static void main(String args[])
{
    Scanner sc = new Scanner (System.in);
    String name = sc.nextLine();

    PrintMyname(name);

    sc.close();

}

}
