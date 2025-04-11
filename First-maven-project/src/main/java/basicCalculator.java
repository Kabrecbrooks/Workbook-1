import java.sql.SQLOutput;
import java.util.Scanner;

public class basicCalculator
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Do you want to add, subtract, divide or multiply");
        String operation = scanner.nextLine();
        System.out.println("You chose to" + operation);

    }
}
