package text;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Translator {

    /** Method encrypts each text word using shift cipher
     * @param text
     */
    static void encrypt(String text){
        char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        InputStream is = Translator.class.getClassLoader().getResourceAsStream(text);

        try {
            BufferedReader lineReader = new BufferedReader(new InputStreamReader(is));
            String lineText;

            while ((lineText = lineReader.readLine()) != null) {
                System.out.println(lineText);
            }

            lineReader.close();
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }

    /** Method decrypts words.
     *
     * @param text Cipher text
     */
    static void decrypt(String text){

    }
}

