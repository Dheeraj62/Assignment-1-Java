import java.util.Scanner;
public  class MaxofThree {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int a , b , c ;
      System.out.println("Enter the value of A : ");
      a = scan.nextInt();
      System.out.println("Enter the value of B : ");
      b= scan.nextInt();
      System.out.println("Enter the value of C : ");
      c = scan.nextInt();
      if(a>b && a>c)
      System.out.println("A is greater");
      else if(b>c)
      System.out.println("B is greater");
      else 
       System.out.println("\nC is greater");
    scan.close();
    }
}
