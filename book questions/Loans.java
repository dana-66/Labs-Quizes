import java.util.Scanner;
public class Loans {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the anual intrest rate e.g.,7.25 : ");
        double annualintrestRate = input.nextDouble();
        double monthlyInterestRate = annualintrestRate / 1200;
        
        System.out.print("Enter  the number of years as an integer e.g. 5 :");
        int numberOfyears = input.nextInt();
        
        System.out.print("Enter the loan amount: ");
        double loanAmount = input.nextDouble();
        //calculate payment 
        double monthlyPayment = (loanAmount * monthlyInterestRate ) / ( 1 - 1/ Math.pow((1+monthlyInterestRate),(numberOfyears * 12)));
        double totalPayment = monthlyPayment * numberOfyears * 12;
        
        //Display results 
        System.out.println (" the monthly payment is $" +(int)(monthlyPayment * 100) / 100.0 );
        System.out.println("The total payment is $" +(int)(totalPayment * 100) /100.0);  
    }
    
}
