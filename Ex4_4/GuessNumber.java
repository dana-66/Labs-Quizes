
package Ex4_4;
import java.util.Scanner;
public class GuessNumber {
    public static void main(String[]args){
        int number = (int)(Math.random()*101);
        Scanner input = new Scanner(System.in);
        
       
        int guess = -1;
        
        while (guess != number){
             System.out.println("Enteer a random integer between 0 and 100  : " );
             guess = input.nextInt();
            
            if (guess == number){
                System.out.println(" Yes you've got it !!!");
            }
            else if (guess < number){
                System.out.println(" Your guess too low");
                
            }
            else{
                System.out.println("Your guess is too High");
            }
        }
        
}}
