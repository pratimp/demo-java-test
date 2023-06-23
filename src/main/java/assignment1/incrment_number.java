package assignment1;

public class incrment_number {
    public static void main(String[] args) {
        int rows = 5; // number of rows
        for (int i = 1; i <= rows; i++) { // outer loop for each row
            for (int j = 1; j <= i; j++) { // inner loop for each column
                System.out.print(j + " "); // print the number with a space
            }
            System.out.println(); // move to the next line
        }
    }
}