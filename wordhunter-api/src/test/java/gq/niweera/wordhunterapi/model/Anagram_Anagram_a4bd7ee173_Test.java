package gq.niweera.wordhunterapi.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class Anagram_Anagram_a4bd7ee173_Test {

    private Anagram anagram;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        anagram = new Anagram();
    }

    @Test
    public void testAnagramObjectNotNull() {
        assertNotNull(anagram);
    }

    // TODO: Add more test cases as per the methods in Anagram class
}
