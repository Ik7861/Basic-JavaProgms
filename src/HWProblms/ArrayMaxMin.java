package HWProblms;

import java.util.Scanner;

public class ArrayMaxMin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Ask user for the number of elements
        System.out.print("Enter the number of elements: ");
        int size = sc.nextInt();
        
        // Declare the array
        int numbers[] = new int[size];

        // Taking input for array
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        // Initialize max and min with the first element
        int max = numbers[0];
        int min = numbers[0];

        // Find max and min in the array
        for (int i = 1; i < size; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        // Output max and min values
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);

        sc.close();
    }
}
