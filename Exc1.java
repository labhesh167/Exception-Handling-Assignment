import java.util.Scanner;

public class Exc1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        try
        {
          int result = num1 / num2;
          System.out.println("result : " + result );
        }
        catch(ArithmeticException e){
            System.out.println("not divisiable by 0");
        }
        sc.close();      
    }
}
