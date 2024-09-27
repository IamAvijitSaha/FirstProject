package NEW.First;

import java.util.Scanner;

public class TC_Formating1 {
    public static void main(String[] args) {
//        %d=integer,byte,short,long
//        %s=String
//        %c=Char
//        %f=float,double
//        Create a Scanner class object to get input from user

        Scanner scanner=new Scanner(System.in);//System.in is the input stream part of scanner class,that allows the program to receive input from the user
                                               //it's user friendly way to parse into data type
//Now ask user to gave their input value
        System.out.print("Enter a number to print its multiplication table: ");
        int number=scanner.nextInt();//NextInt() reads and converts the user input to an int,help us to use in program
        //Loop to print the multiplication table
        System.out.println("Multiplication table for: " +number + ":");
        for(int i=1;i<=10;i++){
            System.out.println(number +"x" + i + "=" +(number*i));
        }



    }
}
