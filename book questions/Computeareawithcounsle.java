import java.util.*;
public class Computeareawithcounsle {
   public static void main (String[]arg){
    Scanner input = new Scanner (System.in);
    
    System.out.println( " Enter a number for radius : ");
    
    double radius = input.nextDouble();
    
    double area = radius * radius * 3.14159;
    System.out.println(" the area for the circle of radius "+radius + " is " +area );
   }
}
