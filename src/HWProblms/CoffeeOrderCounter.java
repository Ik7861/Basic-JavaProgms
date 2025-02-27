package HWProblms;

import java.util.*;

public class CoffeeOrderCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Ask the user for the number of orders
        System.out.println("Enter the number of coffee orders:");
        int numOrders = sc.nextInt();
        
        double totalSum = 0.0; // To store the total sum of all orders
        
        // Loop to process each order
        for (int i = 1; i <= numOrders; i++) {
            System.out.println("Enter the price of coffee order " + i + ":");
            double price = sc.nextDouble();
            totalSum += price; // Add the price to the total sum
        }
        
        // Calculate the average
        double averagePrice = totalSum / numOrders;
        
        // Display the results
        System.out.println("Total money collected: " + totalSum);
        System.out.println("Average price per coffee: " + averagePrice);
        
        sc.close();
    }
}
