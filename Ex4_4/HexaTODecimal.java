
package Ex4_4;
import java.util.Scanner;
public class HexaTODecimal {
    public static void main(String[]args){
       Scanner input = new Scanner(System.in);
       
       System.out.println("Enter  a hex Degit : ");
       String hexString = input.nextLine();
       
       if (hexString.length() !=1){
           System.out.println(" your must enter exactliy one Hexa Degit!");
           System.exit(1);
       }
       char ch = Character.toUpperCase(hexString.charAt(0));
       if('A' <= ch && ch <= 'F'){
           int value = ch - 'A' + 10;
           System.out.println(" the number in Decimal is " +value);
       }
       else if (Character.isDigit(ch)){
           System.out.println(" the number in Decimal is"+ch);
           }
       else{
           System.out.println(ch +" is an Invalid input ");
       }
    }
}
