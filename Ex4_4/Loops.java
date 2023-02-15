
package Ex4_4;
import java.util.Scanner;
public class Loops {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Statment that you want to repeat :  ");
        String stat = input.nextLine();
        
        System.out.println("How many times you want to repeat it ?  ");
        int n = input.nextInt();
        int r = 0;
        while (r < n){
            System.out.println(stat);
            r++;
        }
    }
}
