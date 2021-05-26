package text;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TranslatorTest  {

    @Test
    void testEncrypt() {
        Translator.encrypt("sender.txt");
    }

    @Test
    void testDecrypt() {
    }
}