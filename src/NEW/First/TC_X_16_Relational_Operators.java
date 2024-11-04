package NEW.First;

import java.util.Scanner;

public class TC_X_16_Relational_Operators {
    public static void main(String[] args){
     /*   int a= 20;
        int b= 30;
        boolean c = a>b;
        System.out.println(c);

      */
        Scanner scanner=new Scanner(System.in);

//        Ask user to input two double values
        System.out.print("Enter the first number (a): ");
        double a=scanner.nextDouble();
        System.out.print("Enter the second number (b): ");
        double b=scanner.nextDouble();
        boolean c= a>b;
        System.out.print(c);

    }
}
