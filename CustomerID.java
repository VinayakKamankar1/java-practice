public class CustomerID
{
    public static void main(String[] args)
    {
        
        int[] customerIDs = {101, 105, 110, 120, 130, 135, 145, 150, 200};

        for (int customerID : customerIDs)
        {
            
            if (customerID % 10 == 0)
            {
                System.out.println("Customer ID " + customerID + " is divisible by 10. Stopping the queue.");
                break;
            }
            
            if (customerID % 5 == 0) {
                System.out.println("Customer ID " + customerID + " is divisible by 5. Skipping this customer.");
                continue;
            }

            System.out.println("Processing customer with ID: " + customerID);
        }
    }
}