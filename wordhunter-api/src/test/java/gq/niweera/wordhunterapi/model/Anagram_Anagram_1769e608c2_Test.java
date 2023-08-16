package gq.niweera.wordhunterapi.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class Anagram_Anagram_1769e608c2_Test {

    private Anagram anagram;

    @BeforeEach
    public void setUp() {
        anagram = Mockito.mock(Anagram.class);
    }

    @Test
    public void testAnagramSuccess() {
        List<String> mockAnagrams = Arrays.asList("bat", "tab", "atb");
        when(anagram.getAnagrams()).thenReturn(mockAnagrams);

        Anagram testAnagram = new Anagram();
        testAnagram.setAnagrams(mockAnagrams);
        assertEquals(testAnagram.getAnagrams(), anagram.getAnagrams());
    }

    @Test
    public void testAnagramFailure() {
        List<String> mockAnagrams = Arrays.asList("bat", "tab", "atb");
        when(anagram.getAnagrams()).thenReturn(mockAnagrams);

        Anagram testAnagram = new Anagram();
        testAnagram.setAnagrams(Arrays.asList("bat", "tab", "bt"));
        assertEquals(false, testAnagram.getAnagrams().equals(anagram.getAnagrams()));
    }
}
