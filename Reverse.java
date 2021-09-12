import java.util.Scanner;
    public class Reverse {
    public void  reverse(int n)
    {   int lastdigit;
    int rev = 0;
        while(n>0)
        {
            lastdigit = n%10;
            rev = rev*10 + lastdigit;
            n = n/10;
            
        }
        System.out.println(rev);
    }
    public static void main(String[] args) {
        int num ;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = scan.nextInt();
        Reverse R = new Reverse();
        System.out.println("Number in reverse order : ");
        R.reverse(num);
    }
    }