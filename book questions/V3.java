import java.util.Scanner;

public class V3 {
    public static void main (String[]arg){
    Scanner input = new Scanner(System.in);
    System.out.println(" Enter your number: ");
    
    double number = input.nextDouble();
    
   if (number ==0 ){
            System.out.print("zero");
    }else if (number>0){
        System.out.print("its a positaive");
    }else if (number<0){
        System.out.print("its a negative");
    }
}}
