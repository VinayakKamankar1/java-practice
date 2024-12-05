public class MinMaxExample {
    public static void main(String[] args) {
                int[] arr = {3, 1, 7, 9, 2, 5, 4};
                
                // Initialize the min and max to the first element of the array
                int min = arr[0];
                int max = arr[0];
                
                // Traverse through the array
                for (int i = 1; i < arr.length; i++) {
                    if (arr[i] < min) {
                        min = arr[i];  // Update min
                    }
                    if (arr[i] > max) {
                        max = arr[i];  // Update max
                    }
                }
                
                // Output the results
                System.out.println("Minimum value: " + min);
                System.out.println("Maximum value: " + max);
            }
        }
        

