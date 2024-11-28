import java.util.Scanner;

public class IT24103538Lab5Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //user to input three integers
        System.out.print("Enter three different integers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

         // Find the smallest number  
        int smallest = num1;  // Assume num1 is the smallest
        if (num2 < smallest) smallest = num2;  // If num2 is smaller, update smallest
        if (num3 < smallest) smallest = num3;  // If num3 is smaller, update smallest

        // Find the largest number 
        int largest = num1;  // Assume num1 is the largest
        if (num2 > largest) largest = num2;  // If num2 is larger, update largest
        if (num3 > largest) largest = num3;  // If num3 is larger, update largest

        // Display the results
        System.out.println("user entered numbers are : " +num1 +" "+ num2 +" "+ num3);
        System.out.println("The smallest number is: " + smallest);
        System.out.println("The largest number is: " + largest);
        
    }
}
