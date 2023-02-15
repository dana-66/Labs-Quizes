import java.util.Scanner;
public class H5_15 {      //q16
    public static void main (String[]args){
     Scanner input = new Scanner(System.in);
     System.out.println(" Enter a int to find its factor :");
     int number = input.nextInt();
     int factor=2;
     int answer;
     
     while ( number !=1){
         
         if(number % factor ==0){
             answer = number / factor ;
          System.out.println("the factor is " +answer);
          
          factor++;
          System.out.println (answer);
         }
         else{
             factor +=1;       
             System.out.println("doesnt have a factor");
         }
     break;}
    }}
    

