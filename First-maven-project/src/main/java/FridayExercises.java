import java.util.Scanner;

public class FridayExercises {
    public static void main(String[] args) {
        // say hello
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(" Hello, " + name + " Welcome to the game. ");

        // age in dog years
        System.out.println("What is your age?");
        int age = scanner.nextInt();
        System.out.println(age * 7);

        // dice roll
        int random = (int)(Math.random() * 6) + 1;
        System.out.println("Dice roll :" + random);

        // hero stats

    }
}
