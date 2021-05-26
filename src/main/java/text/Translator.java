package text;

import java.util.Arrays;

public class Translator {
    private static final char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    /**
     * Method encrypts each text word using shift cipher
     */
    static void encrypt(String text) {

        char[] textChar = text.toCharArray();
        char[] cipherText = new char[textChar.length];
        for (int i = 0; i < textChar.length; i++) {

            int retVal = Arrays.binarySearch(alphabet, textChar[i]);
            if (retVal != -1) {
                retVal = retVal + 3;
                cipherText[i] = alphabet[retVal];
            }
        }
        System.out.println("Cypher Message is :  " + new String(cipherText));
    }


    /**
     * Method decrypts words.
     *
     * @param text Cipher text
     */
    static void decrypt(String text) {

        char[] textChar = text.toCharArray();
        char[] cipherText = new char[textChar.length];
        for (int i = 0; i < textChar.length; i++) {

            int retVal = Arrays.binarySearch(alphabet, textChar[i]);
            if (retVal >= 0) {
                retVal = retVal - 3;
                cipherText[i] = alphabet[retVal];
            }

        }
        System.out.println("Decoded Message is :  " + new String(cipherText));
    }


}

