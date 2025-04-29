import java.util.*;

public class Exc2 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
       
        try
        {
        System.out.println("Enter input:-");
        int input = sc.nextInt();
        int result = 100 / input;
        System.out.println("result : " + result);
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("cannot divisible by 0");
        } 
        catch (InputMismatchException I) 
        {
            System.out.println("Enter Required input ");
        }
        sc.close();

    }
}