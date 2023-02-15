import java.util.Scanner;
public class Lottery {
    public static void main (String[]args){
        int Lottery = (int)(Math.random() * 10);
        
        Scanner input = new Scanner(System.in);
        System.out.print (" Enter a number (two digits) : ");
        int guess = input.nextInt();
        
        int LottreyDigit1 = Lottery / 10 ;
        int LotteryDigit2 = Lottery % 10;
        
        int guessDigit1 = guess / 10;
        int guessDigit2 = guess % 10;
        
        if ( guess == Lottery ){
            System.out.println(" Exact match !! you win 10,000 $ ");
            
        }else if (guessDigit1 == LottreyDigit1 && guessDigit2 == LotteryDigit2){
            System.out.println("Match all digits : you win $ 3,000 ");
        }else if (guessDigit1 == LottreyDigit1 || guessDigit2 == LottreyDigit1 || guessDigit2 == LotteryDigit2 ){
             System.out.println("Match one digit ; you win $ 1,000 ");
        }else {
            System.out.println( "Sorry , no match :( ");
        }
           
        
    }
}
