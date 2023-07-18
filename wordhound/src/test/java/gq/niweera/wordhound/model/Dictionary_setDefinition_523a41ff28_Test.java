package gq.niweera.wordhound.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Dictionary_setDefinition_523a41ff28_Test {

    @InjectMocks
    private Dictionary dictionary;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testSetDefinition_validDefinition() {
        String validDefinition = "A valid definition";
        dictionary.setDefinition(validDefinition);
        assertEquals(validDefinition, dictionary.getDefinition());
    }

    @Test
    public void testSetDefinition_emptyDefinition() {
        String emptyDefinition = "";
        dictionary.setDefinition(emptyDefinition);
        assertEquals(emptyDefinition, dictionary.getDefinition());
    }
}
