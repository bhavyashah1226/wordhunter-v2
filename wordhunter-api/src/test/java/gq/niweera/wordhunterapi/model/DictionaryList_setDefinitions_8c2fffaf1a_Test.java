package gq.niweera.wordhunterapi.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DictionaryList_setDefinitions_8c2fffaf1a_Test {

    @Mock
    Dictionary dictionary1, dictionary2;

    private List<Dictionary> dictionaryList;
    private DictionaryList dictionaryListInstance;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);

        dictionary1 = new Dictionary();
        dictionary2 = new Dictionary();

        dictionaryList = Arrays.asList(dictionary1, dictionary2);
        dictionaryListInstance = new DictionaryList();
    }

    @Test
    public void testSetDefinitions_success() {
        dictionaryListInstance.setDefinitions(dictionaryList);
        assertEquals(dictionaryList, dictionaryListInstance.getDefinitions());
    }

    @Test
    public void testSetDefinitions_null() {
        dictionaryListInstance.setDefinitions(null);
        assertEquals(null, dictionaryListInstance.getDefinitions());
    }
}
