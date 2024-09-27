package NEW.First;

import java.util.Scanner;

public class TC_X_13_SimpleCalculatorScanner {
    public static void main(String[] args) {
//        create a Scanner object to get input from user
        Scanner scanner=new Scanner(System.in);

//        Ask user to input two double values
        System.out.print("Enter the first number (a): ");
        double a=scanner.nextDouble();
        System.out.print("Enter the second number (b): ");
        double b=scanner.nextDouble();

//        perform basic arithmetic functions
        double addition = a+b;
        double subtraction= a-b;
        double multiplication= a*b;
        double division = a/b;
        double modulus = a%b; //modulus give the remainder when a is divided by b

//        print the results
        System.out.println("a + b = "+addition);
        System.out.println("a - b = "+subtraction);
        System.out.println("a * b = "+multiplication);
        System.out.println("a / b = "+division);
        System.out.println("a % b = "+modulus);
//Close the scanner
        scanner.close();
    }
}

