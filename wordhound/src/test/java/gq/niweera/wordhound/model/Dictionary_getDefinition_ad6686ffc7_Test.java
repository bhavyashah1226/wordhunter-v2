package gq.niweera.wordhound.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class Dictionary_getDefinition_ad6686ffc7_Test {

    @Mock
    private Dictionary dictionary;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
        when(dictionary.getDefinition()).thenReturn("A unit of language, consisting of one or more spoken sounds or their written representation, that functions as a principal carrier of meaning.");
    }

    @Test
    public void testGetDefinitionSuccess() {
        String definition = dictionary.getDefinition();
        assertEquals("A unit of language, consisting of one or more spoken sounds or their written representation, that functions as a principal carrier of meaning.", definition);
    }

    @Test
    public void testGetDefinitionFailure() {
        when(dictionary.getDefinition()).thenReturn(null);
        String definition = dictionary.getDefinition();
        assertEquals(null, definition);
    }
}
