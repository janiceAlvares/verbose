package text;

import java.util.Arrays;

public class Translator {
    private static final char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    public static void main(String[] args) {
        System.out.println("Welcome to the cypher program.");
        StringBuilder output = new StringBuilder();
        String op = args[0];
        String[] words = Arrays.stream(args, 1, args.length).toArray(String[]::new);

        if (!op.isEmpty() && op.equalsIgnoreCase("CIPHER")) {
            for (String s : words)
                output.append(encrypt(s.toUpperCase())).append(" ");

        } else if (!op.isEmpty() && op.equalsIgnoreCase("DECIPHER")) {
            for (String s : words)
                output.append(decrypt(s.toUpperCase())).append(" ");

        } else {
            System.out.println("Please specify mode.");
            System.exit(1);
        }
        System.out.println("Output is " + output);

    }


    /**
     * Method encrypts each text word using shift cipher
     */
    public static String encrypt(String text) {

        char[] textChar = text.toCharArray();
        char[] cipherText = new char[textChar.length];
        for (int i = 0; i < textChar.length; i++) {

            int retVal = Arrays.binarySearch(alphabet, textChar[i]);
            if (retVal >= 0) {
                retVal = (retVal + 3) % alphabet.length;
                cipherText[i] = alphabet[retVal];
            }
        }
        return new String(cipherText);
    }

    public static String decrypt(String text) {

        char[] textChar = text.toCharArray();
        char[] cipherText = new char[textChar.length];
        for (int i = 0; i < textChar.length; i++) {

            int retVal = Arrays.binarySearch(alphabet, textChar[i]);
            if (retVal >= 0) {
                retVal = retVal < 3 ? alphabet.length + retVal - 3 : retVal - 3;
                cipherText[i] = alphabet[retVal];
            }


        }
        return new String(cipherText);
    }

}

