import java.util.Scanner;
public class Factorial 
{
    public static void main(String[] args) {
        int  i ;
        int fact = 1;
        int num;
        System.out.println("Enter a number :");
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        for(i = 1;i<=num;++i)
        {
            fact = fact*i;
        }
        System.out.println("Factorial of the number : " + fact);
        scan.close();
    }
}