import java.util.Scanner;
class CheckPrime
 {
    public void   chkprime(int n )
    {   int c = 0;
       
        for (int i = 2 ;i < n ;++i )
        {
            if((n%i) == 0)
            {c = 1 ;
            break;

        }
    }
    if (n == 1 )
    {
    System.out.println("Neither a prime nor composite");
    }
    else {
        if(c ==1)
        
            System.out.println("Not a prime number");
        
        else 
            System.out.println("It's a prime number");   
        
    }
        }
       
    public static void main(String args[])
    {   int num ; 
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num  = scan.nextInt();
        CheckPrime C = new CheckPrime();
        C.chkprime(num);
        scan.close();
    }
}
