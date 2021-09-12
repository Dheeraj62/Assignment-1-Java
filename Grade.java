import java.util.Scanner;

public class Grade {
  
    public String  grade(double percentage)
    {  
        String g;
        if(percentage>90)
        g = "A+";
        else if(percentage>80)
        g= "A";
        else if(percentage>70)
        g= "B+";
        else if(percentage>60)
        g= "B";
        else if(percentage>50)
        g= "C+";
        else if(percentage>40)
        g= "C";
        else if(percentage>33)
        g= "D";
        else{
            g = "Fail";
        }

        return g;
    }
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double percentage;
        System.out.println("Enter the percentage : ");
        percentage = scan.nextDouble();
        Grade grade = new Grade();
        System.out.println("Your grade : " + grade.grade(percentage));
        
        scan.close();

    }
}
