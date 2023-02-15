import java.util.Scanner;

public class Q14 {

public static void main (String[]args){

     Scanner input = new Scanner(System.in);

     System.out.println("Enter an integer ");

     int number = input.nextInt();

     if ( number % 2 == 0 ){

        System.out.println (number +" is even ");}

    else {

          System.out.println(  number +"is odd");

}
 System.out.println("Do you want to contenue ?  (type true or FALSE )");
    input = new Scanner(System.in);

  

   boolean answer = input.nextBoolean();


do {

     if ( number % 2 == 0 ){

        System.out.println (number +" is even ");}

    else {

          System.out.println(  number +"is odd");

}while (answer == true )







     
    