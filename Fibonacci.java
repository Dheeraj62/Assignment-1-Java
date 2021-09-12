import java.util.Scanner;
public class Fibonacci {
 public void fibonacci(int num)
 {  
     
     int a = 0 , b =1 , c ;
     System.out.print("Fibonacci series :- " + a + " "+ b + " ");
     for (int i = 2;i<num;i++)
     {
         c = a+b;
         System.out.print(c + " ");
         a = b ;
         b = c;

     }
     
 }   
 public static void main(String[] args) {
     int u ;
     Scanner scan = new Scanner(System.in);
     System.out.println("Enter the upper bound for the fibonacci seires :");
     u = scan.nextInt();
     Fibonacci F = new Fibonacci();
     F.fibonacci(u);
     scan.close();
 }
}
