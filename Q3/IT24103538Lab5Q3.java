import java.util.Scanner;

public class IT24103538Lab5Q3 {
    //room charges per day
    private static final double ROOM_CHARGE_PER_DAY = 48000.00;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // user input for start and end dates
        System.out.print("Enter the start date (1-31): ");
        int startDate = scanner.nextInt();
        System.out.print("Enter the end date (1-31): ");
        int endDate = scanner.nextInt();

        // Validation 1: Dates should be between 1 and 31
        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println(" Dates should be between 1 and 31.");
            return;
        }

        // Validation 2: Start date should be less than the end date
        if (startDate >= endDate) {
            System.out.println("Start date must be less than the end date.");
            return;
        }

        // Calculate the number of days reserved
        int numberOfDays = endDate - startDate;

        // Determine the discount rate
        double discountRate;
        if (numberOfDays <= 3) {
            discountRate = 0;
        } else if (numberOfDays <= 4) {
            discountRate = 10;
        } else {
            discountRate = 20;
        }

        // Calculate total cost and apply discount
        double totalCost = numberOfDays * ROOM_CHARGE_PER_DAY;
        double discountedCost = totalCost - (totalCost * discountRate / 100);

        // Display results
        System.out.println("Room charge Per day : " + ROOM_CHARGE_PER_DAY);
        System.out.println("Number of days reserved: " + numberOfDays);
        System.out.println("Total amount to be paid : Rs " + discountedCost);
       
    }
}
