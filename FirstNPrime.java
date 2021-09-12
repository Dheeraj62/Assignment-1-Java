import java.util.Scanner;
public class FirstNPrime {

    public static void main(String[] args) {
        int number ; 
        int count = 0;
        int p = 2;
        int i ;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of N :");
        number = scan.nextInt();
      System.out.print("First N prime numbers  : ");
       while(count<number)
       {
         for(i = 2 ; i<p;i++)
         {
           if(p%i  == 0 )
           {
             break;
           }
          }
           if(i==p)
           {
           System.out.print(p + "\t");
           count++;
           }
         p++;  
       }
        scan.close();
    }
}
