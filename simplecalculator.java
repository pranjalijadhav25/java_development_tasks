import java.util.Scanner;

public class simplecalculator {
public static void main(String[] args) {
     System.out.println("SIMPLE CALCULATOR ");
    Scanner sc=new Scanner(System.in);
     System.out.println("enter a");
     int a= sc.nextInt();
     System.out.println("enter b");
     int b= sc.nextInt();


           System.out.println("Select the option below" + "To Perform Particular Operation");
           System.out.println("1.Addition  \n  2.Subtraction \n  3.Multiplication \n  4.Division  \n 5.Remainder"  );
           int option=sc.nextInt();
           switch (option) {
            case 1:
                System.out.println("a + b = " + (a+b));
                break;
            case 2:
                 System.out.println("a - b = " + (a-b));
                 break;
            case 3:
                 System.out.println("a * b = " + (a*b));
                 break;
            case 4:
                 System.out.println("a / b = " + (a/b));
                 break;
            case 5:
                 System.out.println("a % b = " + (a%b));
                 break;
            default:
            System.out.println("Enter Valid Option");
                break;
           }
           sc.close();
}    

}
