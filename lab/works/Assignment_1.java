import java.util.Scanner;
public class Assignment_1 {               //Dana Shatat 220190488 
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the sides of the first tringlr (i.e. A , B , C ) : ");
        double A1 = input.nextDouble();
        double A2 = input.nextDouble();
        double A3 = input.nextDouble();
        
        System.out.print("Enter the sides of the second tringlr (i.e. A , B , C ) : ");
        double B1 = input.nextDouble();
        double B2 = input.nextDouble();
        double B3 = input.nextDouble();
        
        double area1 = copmutaArea( A1 , A2 , A3);
        double area2 = copmutaArea( B1 , B2 , B3);
        
        if ( area1 >= area2){
             System.out.println("the triangle with largest area has the folowing sides : " +"\n Side1 = " +A1 +" side2 = " +A2 +" side3 = "+A3 );
        }else if (area2 >= area2){
            System.out.println("the triangle with largest area has the folowing sides : " +"\n Side1 = " +B1 +" side2 = " +B2 +" side3 = "+B3 );    
        }
    
//     System.out.println(largerArea(area1 , area2));
    }
    
    public static double copmutaArea (double A , double B , double C){
        double area = 0; 
        
       double s = (A + B + C) / 2;       // semi perimeter .
       
       area = Math.sqrt(s*((s-A)*(s-B)*(s-C)));
       return area;
    }
    
//    public static double largerArea (double area1 , double area2){
//        double result = area1;
//        
//        if (area2 >= result ){
//            result = area2;
//            System.out.println( area1 +" is greater than" +area2);
//        }
//        else {
//            System.out.print(area2 +" is greater than " +area1);
//        }return result ;
      
    }

