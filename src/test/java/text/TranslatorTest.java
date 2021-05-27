package text;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TranslatorTest  {

    @Test
    void testEncrypt() {
        assertEquals(Translator.encrypt("HELLO HOW ARE YOU TODAY"), "KHOOR KRZ DUH BRX WRGDB");
    }

    @Test
    void testDecrypt() {
        assertEquals(Translator.decrypt("KHOOR KRZ"), "HELLO HOW");

    }
}