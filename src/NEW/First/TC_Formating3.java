package NEW.First;

import java.util.Scanner;

public class TC_Formating3 {
    public static void main(String[] args) {
//        %d=integer,byte,short,long
//        %s=String
//        %c=Char
//        %f=float,double
//        Create a Scanner object to get input from user

        Scanner scanner=new Scanner(System.in);

//Now ask user to gave their input value
        System.out.print("Enter a number to print its multiplication table: ");
        int number=scanner.nextInt();
        //Loop to print the multiplication table
        System.out.println("Multiplication table for: " +number + ":");
        for(int i=1;i<=10;i++){
            System.out.printf("%d * %2d = %d%n",number,i,number*i);
        }



    }
}
