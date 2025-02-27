package HWProblms;

import java.util.*;

public class CircumferenceOfCircle{

public static double circumference(double radius){
    
    return 2 * Math.PI*radius;
    
}
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the radius:");
    double radius = sc.nextDouble();

    double circumferenceValue = circumference(radius);
    System.out.println("Circumferance of a circle :"+ circumferenceValue);


    sc.close();
 }
}