package Practice.ExceptionHandling;

public class ExceptionHandling {
    public static void main(String[] args) {
        System.out.println("Started!!");
        int a = 0;
        try{
            int b = 9/a;
            System.out.println("B = " + b);
        }
        catch(ArithmeticException exp){ // we 
            System.out.println(exp);
            System.out.println(exp.getMessage());
        }
        System.out.println("Completed!!");
    }
}
