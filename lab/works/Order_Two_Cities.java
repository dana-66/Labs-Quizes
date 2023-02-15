
package lab.works;
import java.util.Scanner;
public class Order_Two_Cities {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the first city: ");
        String first = input.nextLine();
        
        System.out.println("Enter the second city: ");
        String sec = input.nextLine();
        
        if(first.compareTo(sec) < 0 ){
           System.out.println(" The citeies in alphabetical order are " +first +"  " +sec ); 
        }
        else{
             System.out.println(" The citeies in alphabetical order are " +sec +"  "+first);
              
        }
    }
}
