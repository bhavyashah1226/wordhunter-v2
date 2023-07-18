package gq.niweera.wordhound.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class Dictionary_Dictionary_e26b7c873b_Test {

    @InjectMocks
    private Dictionary dictionary;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testDictionaryConstructor() {
        Dictionary testDictionary = new Dictionary();
        assertNotNull(testDictionary);
    }

    @Test
    public void testInjectedDictionaryNotNull() {
        assertNotNull(dictionary);
    }
}
