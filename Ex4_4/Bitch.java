
package Ex4_4;
import java.util.Scanner;
public class Bitch {
    public static void main(String[]args){
////        
//        for(int i = 0 , j = 0; i + j<10;i++, j++){
//            System.out.println("Bitch" +"\t"+i +"\t"+j);
//        }
//        for (int i =0; i < 100; System.out.println(i) , i++){
//        }
//  

    Scanner input = new Scanner(System.in); 
       int number, sum = 0;
       int count;
       System.out.println("Enter number");

         for (count = 0; count <5; count++) {
            number = input.nextInt();
            sum += number;
           }
    System.out.println("sum is " + sum);
    System.out.println("count is " + count);
  }
}
    

