
public class Chapter4 {
    public static void main(String[]args){
        char ch = '1';
        System.out.println( "the asci code is : " +(int)'B'  +"\t" +(int)'b' +"\t" +(int)'a');
        
        System.out.println("the char is :  " +(char)40 +"\t" +(char)59 +"\t" +(char)79 +"\t" +(char)85 +"\t" +(char)90 );
    
        System.out.println("Java " + 1 + 2 + 3);
        System.out.println((char)0X40);
        System.out.println((char)0X5A);
        System.out.println((char)0X71);
        System.out.println((char)0X72);
        System.out.println((char)0X7A);
        
        double sum = 0;
for (int i = 1; i <= 99; i++) {
  sum = i / (i + 1);
}
System.out.println("Sum is " + sum);

   
    
for (int i = 1; i < 99; i++) {
  sum += i / (i + 1);
}
System.out.println("Sum is " + sum);
    
    int y = 0;
    for (int i = 0; i < 10; ++i) {
         y += i;
         System.out.println(y);
    }
    
    
    
    
    }
}
