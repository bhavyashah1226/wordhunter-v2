package gq.niweera.wordhunterapi.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Dictionary_getDefinition_b043786895_Test {
    @Test
    public void testGetDefinition() {
        Dictionary dictionary = new Dictionary();
        dictionary.setDefinition("A branch of knowledge");
        String definition = dictionary.getDefinition();
        assertEquals("A branch of knowledge", definition, "Expected definition does not match the actual definition");
    }

    @Test
    public void testGetDefinitionWhenDefinitionIsNull() {
        Dictionary dictionary = new Dictionary();
        String definition = dictionary.getDefinition();
        assertNull(definition, "Definition is expected to be null");
    }

    @Test
    public void testGetDefinitionWhenDefinitionIsEmpty() {
        Dictionary dictionary = new Dictionary();
        dictionary.setDefinition("");
        String definition = dictionary.getDefinition();
        assertEquals("", definition, "Expected definition does not match the actual definition");
    }
}
