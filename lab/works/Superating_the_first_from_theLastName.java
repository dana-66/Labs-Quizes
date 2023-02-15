
package lab.works;
import java.util.Scanner;
public class Superating_the_first_from_theLastName {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        System.out.println(" Enter full name : ");
        String fName = input.nextLine();
        
        int k = fName.indexOf(' ');
        String firstName = fName.substring(0,k);
        String secName = fName.substring(k+1);
        
        System.out.println("The First name is : " +firstName +"\nand the second name is: "+secName);
        
      
    }
}
