
package lab.works;
import java.util.Scanner;
public class H {
    public static void main (String[]arg){
        Scanner input = new Scanner(System.in);
        
        System.out.println(" Enter X , Y");
        int x = input.nextInt();
        int y = input.nextInt();
        
        if (x > 2)  
          if(y>2){
              int z = x + y;
               System.out.println( "Z is " +z);
          }  
          else 
              System.out.println("X is " +x);
        
    }
}
