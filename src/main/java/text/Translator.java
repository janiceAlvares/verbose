package text;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Translator {

    /**
     * Method encrypts each text word using shift cipher
     *
     * @param text
     */
    static void encrypt(String text) {
        char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        InputStream is = Translator.class.getClassLoader().getResourceAsStream(text);

        try {
            BufferedReader lineReader = new BufferedReader(new InputStreamReader(is));
            String lineText;

            while ((lineText = lineReader.readLine()) != null) {

                System.out.println(lineText);
                char[] textChar = lineText.toCharArray();
                char[] cipherText = new char[textChar.length];
                for (int i = 0; i < textChar.length; i++) {

                   int retVal = Arrays.binarySearch(alphabet, textChar[i]);
                   retVal = retVal + 3;
                   cipherText[i] = alphabet[retVal];
                   System.out.println(cipherText[i]);

                }
            }

            lineReader.close();
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }

    /**
     * Method decrypts words.
     *
     * @param text Cipher text
     */
    static void decrypt(String text) {

    }
}

