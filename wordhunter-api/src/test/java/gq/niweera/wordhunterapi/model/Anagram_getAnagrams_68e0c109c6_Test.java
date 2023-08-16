package gq.niweera.wordhunterapi.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import org.mockito.Mockito;
import java.util.Arrays;
import java.util.List;

public class Anagram_getAnagrams_68e0c109c6_Test {

    private Anagram anagram = Mockito.mock(Anagram.class);

    @Test
    public void testGetAnagramsSuccess() {
        List<String> expectedAnagrams = Arrays.asList("cat", "act", "tac");
        when(anagram.getAnagrams()).thenReturn(expectedAnagrams);
        List<String> actualAnagrams = anagram.getAnagrams();
        assertEquals(expectedAnagrams, actualAnagrams);
    }

    @Test
    public void testGetAnagramsEmpty() {
        List<String> expectedAnagrams = Arrays.asList();
        when(anagram.getAnagrams()).thenReturn(expectedAnagrams);
        List<String> actualAnagrams = anagram.getAnagrams();
        assertEquals(expectedAnagrams, actualAnagrams);
    }
}
