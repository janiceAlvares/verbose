package text;

import org.junit.jupiter.api.Test;

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