package assignment1;
import java.util.Scanner;

public class sum_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.print("Enter an integer number (or 'q' to quit): ");
            String input = scanner.nextLine();
            if (input.equals("q")) {
                break;
            }
            try {
                int number = Integer.parseInt(input);
                sum += number;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer number.");
            }
        }
        System.out.println("The sum of numbers is " + sum);
    }
}
