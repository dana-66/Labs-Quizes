
package Ex4_4;
import java.util.Scanner;
public class NoClue {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

//    int number, max;
//    number = input.nextInt();
//    max = number;
//
//    while (number != 0) {
//      number = input.nextInt();
//      if (number > max)
//        max = number; 
//    }
//
//    System.out.println("max is " + max);
//    System.out.println("number " + number);
//   

int number, max;
    number = input.nextInt(); 
    max = number;

    do {
      number = input.nextInt();
      if (number > max)
        max = number;
    } while (number != 0);

    System.out.println("max is " + max);
    System.out.println("number " + number); 
        
    }}