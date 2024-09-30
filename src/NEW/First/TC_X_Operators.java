package NEW.First;

import java.util.Scanner;

public class TC_X_Operators {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("please provide the first no: ");
        int First_number=scanner.nextInt();
        System.out.println("please provide the second no: ");
        int Second_number=scanner.nextInt();//Single Assignment Operator
//        System.out.printf("%d + %2d= %d%n",First_number,Second_number,First_number*Second_number);
        System.out.println(First_number+Second_number +"=" +First_number*Second_number);//Multiple operator here we can able to see
    }
}
