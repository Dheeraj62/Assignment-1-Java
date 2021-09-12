import java.util.Scanner;

public class PrimeUptoN
{
    public static void main(String[] args) {
        int number;
       
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of N :");
        number = scan.nextInt();
        System.out.print("Prime numbers upto N  : ");
        for(int i = 2 ; i<=number ; i++)
        { int c = 0;
            for(int j = 2 ; j<=i/2;j++)
            {
                if(i%j==0)
                {c =1;
                break;
                }
            } 
            if(c==0)
            System.out.print(i+ "\t"); 
        }
        scan.close();
    }
}