package gq.niweera.wordhunterapi.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Dictionary_Dictionary_20b51a3144_Test {
    private Dictionary dictionary;

    @BeforeEach
    public void setUp() {
        dictionary = new Dictionary();
        dictionary.setWord("test");
        dictionary.setDefinition("This is a test definition");
    }

    @Test
    public void testDictionaryWord() {
        assertEquals("test", dictionary.getWord(), "The word in the dictionary should be 'test'");
    }

    @Test
    public void testDictionaryDefinition() {
        assertEquals("This is a test definition", dictionary.getDefinition(), "The definition in the dictionary should be 'This is a test definition'");
    }

    @Test
    public void testDictionaryWordWithNull() {
        Dictionary nullDictionary = new Dictionary();
        nullDictionary.setWord(null);
        nullDictionary.setDefinition("This is a test definition");
        assertNull(nullDictionary.getWord(), "The word in the dictionary should be null");
    }

    @Test
    public void testDictionaryDefinitionWithNull() {
        Dictionary nullDictionary = new Dictionary();
        nullDictionary.setWord("test");
        nullDictionary.setDefinition(null);
        assertNull(nullDictionary.getDefinition(), "The definition in the dictionary should be null");
    }
}
