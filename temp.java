import java.util.Scanner;
public class temp 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Temp:");
        int temperature=sc.nextInt();

        if(temperature <  15)
        {
        System.out.println("Temperature is Cold");
        }
        else if (temperature > 15 && temperature < 30)
        {
            System.out.println("The weather is warm");
        }
        else 
        {
            System.out.println("The weather is hot.");
        }
        

    }
}
