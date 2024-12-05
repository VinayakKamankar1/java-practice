import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // List to store customer details
        Map<Integer, String> customers = new HashMap<>();
        Map<Integer, Double> incomes = new HashMap<>();

        System.out.println("Enter the number of customers:");
        int numberOfCustomers = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Input customer details
        for (int i = 1; i <= numberOfCustomers; i++) {
            System.out.println("Enter the name of customer " + i + ":");
            String name = scanner.nextLine();

            System.out.println("Enter the monthly income of " + name + ":");
            double income = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            customers.put(i, name);
            incomes.put(i, income);
        }

        System.out.println("\nEligible Customers:");
        boolean foundEligible = false;

        for (int id : customers.keySet()) {
            if (incomes.get(id) > 25000) {
                System.out.println("ID: " + id + ", Name: " + customers.get(id));
                foundEligible = true;
            }
        }

        if (!foundEligible) {
            System.out.println("No customers are eligible for the loan.");
        }

        scanner.close();
    }
}