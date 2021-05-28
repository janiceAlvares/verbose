package text;

import java.util.Arrays;

import static java.lang.String.join;
import static java.util.Arrays.stream;

public class Translator {
    private static final char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    public static void main(String[] args) {
        System.out.println("Welcome to the cypher program.");
        if(args.length == 0){
            System.out.println("Please enter your message as program arguments.");
            System.exit(0);
        }
        String op = args[0];
        String[] words = stream(args, 1, args.length).toArray(String[]::new);
        String message = join(",", words);
        if (!op.isEmpty() && op.equalsIgnoreCase("CIPHER")) {
            System.out.println("Ciphered message is ::::::::  " + encrypt(message));

        } else if (!op.isEmpty() && op.equalsIgnoreCase("DECIPHER")) {
            System.out.println("Deciphered message is :::::::  " + decrypt(message));

        } else {
            System.out.println("Please chose mode of operation: CIPHER or DECIPHER.");
            System.exit(0);
        }

    }


    /**
     * Method encrypts each text word using shift cipher
     */
    public static String encrypt(String text) {

        char[] textChar = text.toUpperCase().toCharArray();
        char[] cipherText = new char[textChar.length];
        for (int i = 0; i < textChar.length; i++) {

            int retVal = Arrays.binarySearch(alphabet, textChar[i]);
            if (retVal >= 0) {
                retVal = (retVal + 3) % alphabet.length;
                cipherText[i] = alphabet[retVal];
            }
        }
        return new String(cipherText).replace("\0", " ");
    }

    public static String decrypt(String text) {

        char[] textChar = text.toUpperCase().toCharArray();
        char[] decipherText = new char[textChar.length];
        for (int i = 0; i < textChar.length; i++) {

            int retVal = Arrays.binarySearch(alphabet, textChar[i]);
            if (retVal >= 0) {
                retVal = retVal < 3 ? alphabet.length + retVal - 3 : retVal - 3;
                decipherText[i] = alphabet[retVal];
            }


        }
        return new String(decipherText).replace("\0", " ");
    }

}

