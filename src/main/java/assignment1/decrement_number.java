package assignment1;

public class decrement_number {
    public static void main(String[] args) {
        int rows = 5; // number of rows
        for (int i = 1; i <= rows; i++) { // outer loop for each row
            for (int j = i; j <= rows; j++) { // inner loop for each column
                System.out.print(j +""); // print the number with a space
            }
            System.out.println(); // move to the next line
        }
    }
}