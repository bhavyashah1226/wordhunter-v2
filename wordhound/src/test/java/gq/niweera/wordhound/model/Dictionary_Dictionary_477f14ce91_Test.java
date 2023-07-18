package gq.niweera.wordhound.model;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Dictionary_Dictionary_477f14ce91_Test {

    private Dictionary dictionary;

    @Before
    public void setUp() {
        dictionary = new Dictionary();
        dictionary.setWord("test");
        dictionary.setDefinition("a procedure intended to establish the quality, performance, or reliability of something, especially before it is taken into widespread use.");
    }

    @Test
    public void testDictionaryWord() {
        assertEquals("test", dictionary.getWord());
    }

    @Test
    public void testDictionaryDefinition() {
        assertEquals("a procedure intended to establish the quality, performance, or reliability of something, especially before it is taken into widespread use.", dictionary.getDefinition());
    }

    @Test
    public void testDictionaryWithNoWord() {
        dictionary.setWord("");
        assertEquals("", dictionary.getWord());
    }

    @Test
    public void testDictionaryWithNoDefinition() {
        dictionary.setDefinition("");
        assertEquals("", dictionary.getDefinition());
    }

    @Test
    public void testDictionaryWithNullWord() {
        dictionary.setWord(null);
        assertEquals(null, dictionary.getWord());
    }

    @Test
    public void testDictionaryWithNullDefinition() {
        dictionary.setDefinition(null);
        assertEquals(null, dictionary.getDefinition());
    }
}
