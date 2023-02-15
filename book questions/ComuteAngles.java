import java.util.Scanner;
public class ComuteAngles {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        // promot the user to enter the inputs 
        System.out.print("Enter three points 'e.g. X1 y1 , X2 ,Y2 , X3,Y3' : ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        
        // calculate the sides a , b ,c باستخدام فانون المسافة بين نقطتين 
        double a = Math.sqrt((x2 - x3) *(x2 - x3) + (y2 - y3) * (y2 - y3));
        double b = Math.sqrt((x1 - x3) *(x1 - x3) + (y1 - y3) * (y1 - y3));
        double c = Math.sqrt((x1 - x2) *(x1 - x2) + (y1 - y2) * (y1 - y2));
        
        // promote the Angeles given the aquation in the example:
        double A = Math.toDegrees( Math.acos(((a * a) - (b * b) -(c * c)) / ( -2 * b * c)));
        double B = Math.toDegrees( Math.acos(((a * a) - (b * b) -(c * c)) / ( -2 * b * c)));
        double C = Math.toDegrees( Math.acos(((a * a) - (b * b) -(c * c)) / ( -2 * b * c)));
        
        // Display the results:
        System.out.println("The three Angles are : " +Math.round(A*100) / 100.0+"  "  +Math.round(B*100) / 100.0 +"  "  +Math.round(C*100) / 100.0);
    }
}
