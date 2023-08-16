package gq.niweera.wordhunterapi.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Dictionary_getWord_5c3dc5bda9_Test {
    private Dictionary dictionary;

    @BeforeEach
    public void setup() {
        dictionary = new Dictionary();
    }

    @Test
    public void testGetWord_WhenWordIsSet() {
        String expectedWord = "testWord";
        dictionary.setWord(expectedWord);
        String actualWord = dictionary.getWord();
        assertEquals(expectedWord, actualWord);
    }

    @Test
    public void testGetWord_WhenWordIsNotSet() {
        String expectedWord = null;
        String actualWord = dictionary.getWord();
        assertEquals(expectedWord, actualWord);
    }
}
