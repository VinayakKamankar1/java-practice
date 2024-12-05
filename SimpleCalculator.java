import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        double num1, num2, result;

        while (true) {
            // Displaying the menu
            System.out.println("\nSelect an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus (Remainder)");
            System.out.println("6. Exit");
            
            // Taking user input for operation choice
            System.out.print("Enter choice (1/2/3/4/5/6): ");
            choice = scanner.nextInt();
            
            // If user wants to exit the program
            if (choice == 6) {
                System.out.println("Exiting the program...");
                break;
            }
            
            // Taking two numbers as input
            System.out.print("Enter first number: ");
            num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            num2 = scanner.nextDouble();
            
            // Perform the chosen operation using switch-case
            switch (choice) {
                case 1: // Addition
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;
                
                case 2: // Subtraction
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;
                
                case 3: // Multiplication
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;
                
                case 4: // Division
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                
                case 5: // Modulus (Remainder)
                    if (num2 != 0) {
                        result = num1 % num2;
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Error: Modulus by zero is not allowed.");
                    }
                    break;
                
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }

        scanner.close(); // Close the scanner object
    }
}
