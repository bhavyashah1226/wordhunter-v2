package gq.niweera.wordhunterapi.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Dictionary_setDefinition_254636cc50_Test {

    Dictionary dictionary;

    @BeforeEach
    public void setUp(){
        dictionary = new Dictionary();
    }

    @Test
    public void testSetDefinition_Success() {
        String expectedDefinition = "A word or phrase used to describe a thing or to express a concept";
        dictionary.setDefinition(expectedDefinition);
        assertEquals(expectedDefinition, dictionary.getDefinition());
    }

    @Test
    public void testSetDefinition_Null() {
        String expectedDefinition = null;
        dictionary.setDefinition(expectedDefinition);
        assertEquals(expectedDefinition, dictionary.getDefinition());
    }
}
