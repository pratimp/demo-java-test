package assignment1;
import java.util.Scanner;

public class reverse_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // create a scanner object
        System.out.println("Enter a number: "); // prompt for a number
        int num = sc.nextInt(); // read the input as an integer
        int reverse = 0; // initialize reverse to zero
        while (num != 0) { // loop until num becomes zero
            int lastDigit = num % 10; // get the last digit of num
            reverse = reverse * 10 + lastDigit; // append the last digit to reverse
            num = num / 10; // remove the last digit of num
        }
        System.out.println("The reverse of the number is: " + reverse); // print the reverse number
        sc.close(); // close the scanner
    }
}
