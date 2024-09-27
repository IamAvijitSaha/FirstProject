package NEW.First;

import java.util.Scanner;

public class TC_Formating_String_UserInput_Formating {
    public static void main(String[] args) {
//        %d=integer,byte,short,long
//        %s=String
//        %c=Char
//        %f=float,double
//        Create a Scanner object to get input from user
        Scanner scanner=new Scanner(System.in);
        Scanner scanner2=new Scanner(System.in);

        System.out.print("Please provide the First Name:");
        String First_Name= scanner.nextLine();
        System.out.print("Please provide the Last Name:");
        String Last_Name= scanner.nextLine();//NextLine use for String
        System.out.printf("%s and %s",First_Name,Last_Name);
    }



    }

