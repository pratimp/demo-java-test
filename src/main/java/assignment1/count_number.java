package assignment1;
import java.util.Scanner;

public class count_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // create a scanner object
        System.out.println("Enter a string: "); // prompt for a string
        String str = sc.nextLine(); // read the input as a string
        int words = 0; // initialize words to zero
        int chars = 0; // initialize chars to zero
        int vowels = 0; // initialize vowels to zero
        int consonants = 0; // initialize consonants to zero
        str = str.toLowerCase(); // convert the string to lowercase
        for (int i = 0; i < str.length(); i++) { // loop over the string
            char ch = str.charAt(i); // get the character at i-th position
            if (ch == ' ') { // if character is a space
                words++; // increment words by one
            } else if (ch >= 'a' && ch <= 'z') { // if character is an alphabet
                chars++; // increment chars by one
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') { // if character is a vowel
                    vowels++; // increment vowels by one
                } else { // if character is a consonant
                    consonants++; // increment consonants by one
                }
            }
        }
        words++; // increment words by one to account for the last word
        System.out.println("Number of words: " + words); // print the number of words
        System.out.println("Number of characters without spaces: " + chars); // print the number of characters without spaces
        System.out.println("Number of vowels: " + vowels); // print the number of vowels
        System.out.println("Number of consonants: " + consonants); // print the number of consonants
        sc.close(); // close the scanner
    }
}
