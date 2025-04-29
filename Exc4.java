import java.util.Scanner;

public class Exc4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number in string: ");
        String input = sc.nextLine();

        try {
            int num = Integer.parseInt(input);
            System.out.println("Converted num:" + num);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format");
        }
    }
}
