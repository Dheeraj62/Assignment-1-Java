import java.util.Scanner;

public class CheckVowel {
    public void vowel(String v )
    {   
        switch(v ) 
        {
            case  "a" : 
           
            case  "e" :
           
            case  "i" :
           
            case  "o" :
          
            case  "u" :
          
            case  "A" :
          
            case  "E" :
          
            case  "I" :
          
            case  "O" :
          
            case  "U" :
            System.out.println("Vowel");
            break; 
           default :
           System.out.println("Consonant");
           break;
        }
     
    }
    public static void main(String[] args) {
        String alphabet ;
        CheckVowel Vowel = new CheckVowel();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any alphabet: ");
        alphabet = scan.next();
        Vowel.vowel(alphabet);   
        scan.close();         
    }
}
