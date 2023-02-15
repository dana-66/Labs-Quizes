import java.util.Scanner;
public class Compute_Change {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount in a double, e.g., 11.65  ");
        double amount = input.nextDouble();
        int ramainingAmount = (int)(amount * 100);
        
        int numberOfdollars = ramainingAmount / 100;
        ramainingAmount = ramainingAmount % 100;
        
        int numberOfQuarters = ramainingAmount / 25 ;
        ramainingAmount = ramainingAmount % 25;
        
        int numbersOfdimes = ramainingAmount / 10;
        ramainingAmount = ramainingAmount % 10;
        
        int numberOfnickels = ramainingAmount / 5;
        ramainingAmount = ramainingAmount % 5;
        
        int numbersOfpennies = ramainingAmount;
        
        System.out.println("your amount : " +amount +" consists of ");
        System.out.println(" " +numberOfdollars +" Dollars.");
        System.out.println(" " +numberOfQuarters +" Quraters.");
        System.out.println(" " +numbersOfdimes +" Dimes.");
        System.out.println(" " +numberOfnickels +" Nickels.");
        System.out.println(" " +numbersOfpennies +" Pennies."); 
    }
}
