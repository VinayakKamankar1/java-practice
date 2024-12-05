import java.util.Scanner;
class CompareInteger{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter First Integer:");
        int a=sc.nextInt();
        System.out.println("Enetr Second Integer:");
        int b=sc.nextInt();

        if(a>b){
            System.out.println("a Integer is grater than b ");
        }
        else if(a<b){
            System.out.println("b integer is greater than a ");
        }
        else{
            System.out.println("a is equal to b ");
        }
    }
}
