package gq.niweera.wordhunterapi.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DictionaryList_DictionaryList_95e15f315c_Test {

    @Mock
    private Dictionary dictionary1;

    @Mock
    private Dictionary dictionary2;

    private DictionaryList dictionaryList;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
        dictionaryList = new DictionaryList();
    }

    @Test
    public void testDictionaryList_CorrectSize() {
        dictionaryList.getDefinitions().add(dictionary1);
        dictionaryList.getDefinitions().add(dictionary2);

        assertEquals(2, dictionaryList.getDefinitions().size());
    }

    @Test
    public void testDictionaryList_EmptyList() {
        assertEquals(0, dictionaryList.getDefinitions().size());
    }
}
