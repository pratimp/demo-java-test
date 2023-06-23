package assignment1;

public class Encrypt_word {
    public static void main(String[] args) {
        String word = "ROADTOSDET"; // word to encrypt
        String encrypted = ""; // encrypted word
        for (int i = 0; i < word.length(); i++) { // loop over the word
            char ch = word.charAt(i); // get the character at i-th position
            ch = (char) (ch + 5); // shift the character by 5 positions
            if (ch > 'Z') { // if the character goes beyond Z
                ch = (char) (ch - 26); // wrap it around from A
            }
            encrypted += ch; // append the encrypted character to the result
        }
        System.out.println("The encrypted word is: " + encrypted); // print the encrypted word
    }
}
