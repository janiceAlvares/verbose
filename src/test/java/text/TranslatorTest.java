package text;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TranslatorTest  {

    @Test
    void testEncrypt() {
        Translator.encrypt("HELLO");
    }

    @Test
    void testDecrypt() {
        Translator.decrypt("KHOOR");
    }
}