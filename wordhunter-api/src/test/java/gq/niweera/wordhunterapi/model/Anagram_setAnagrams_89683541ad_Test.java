package gq.niweera.wordhunterapi.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class Anagram_setAnagrams_89683541ad_Test {

    @InjectMocks
    private Anagram anagram;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
        anagram = new Anagram();
    }

    @Test
    public void testSetAnagrams_Success() {
        List<String> expectedAnagrams = Arrays.asList("test", "tset", "tets", "tste");
        anagram.setAnagrams(expectedAnagrams);
        assertEquals(expectedAnagrams, anagram.getAnagrams());
    }

    @Test
    public void testSetAnagrams_Null() {
        anagram.setAnagrams(null);
        assertNull(anagram.getAnagrams());
    }
}
