package NEW.First;

public class TC_X_12_SimpleCalculator {
    public static void main(String[] args) {
//        declare and initialize the variables
        double a=24;
        double b=26;
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

    }
}

