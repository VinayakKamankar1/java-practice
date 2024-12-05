import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);
        
        // Create a queue to store customer IDs
        Queue<Integer> customerQueue = new LinkedList<>();
        
        // Ask the user for the number of customers
        System.out.print("Enter the number of customers in the queue: ");
        int numCustomers = scanner.nextInt();
        
        // Ask the user to input the customer IDs
        System.out.println("Enter the customer IDs:");
        for (int i = 0; i < numCustomers; i++) {
            int customerId = scanner.nextInt();
            customerQueue.add(customerId);
        }
        
        // Process the customers in the queue
        processQueue(customerQueue);
    }
    
    // Method to process the customers in the queue
    public static void processQueue(Queue<Integer> customerQueue) {
        while (!customerQueue.isEmpty()) {
            int customerId = customerQueue.poll(); // Get the next customer ID from the queue
            
            // Check if the customer ID is divisible by 10 (stop processing)
            if (customerId % 10 == 0) {
                System.out.println("Customer " + customerId + " has a special request to stop the queue. Processing stopped.");
                break; // Stop processing further customers
            }
            
            // Check if the customer ID is divisible by 5 (skip this customer)
            if (customerId % 5 == 0) {
                System.out.println("Customer " + customerId + " is divisible by 5 and will be skipped.");
                continue; // Skip this customer
            }
            
            // Process the customer
            System.out.println("Processing customer " + customerId + ".");
        }
    }
}
