
package Ex4_4;
import java.util.Scanner;

public class Avreage {
   public static void main(String[]args){
       Scanner input = new Scanner(System.in);
  
       
       int num;
       int sum = 0;
       int count = 0;
       System.out.println("Enter integers (end with 0 ):  ");
        num = input.nextInt();
       while(num != 0){
           sum += num;
           num = input.nextInt();
       }
       double Average = sum / 10.0;
       System.out.printf(" the Average is %5.2f\n",Average);
   } 
}
