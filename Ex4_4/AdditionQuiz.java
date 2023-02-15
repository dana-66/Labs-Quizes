
package Ex4_4;
import java.util.Scanner;
public class AdditionQuiz {
    public static void main(String[]args){
    int numb1 = (int)(Math.random()*10);   
    int numb2 = (int)(Math.random()*10);    
        
     Scanner input = new Scanner(System.in);
     System.out.println("What is"+numb1 +" + " +numb2 +" = ");
     int answer = input.nextInt();
     
     while (numb1 + numb2 != answer){
         System.out.println("Wrong answer!!! , Try again\n What is " +numb1 +" + " +numb2 +" ? ");
         answer = input.nextInt();
     }
     
     System.out.println(" you've got it !!!");
     
    }
}
