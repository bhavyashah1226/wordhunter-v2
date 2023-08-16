package gq.niweera.wordhunterapi.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DictionaryList_DictionaryList_2cb7e7b0dc_Test {

    @InjectMocks
    private DictionaryList dictionaryList;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testDictionaryListNotNull() {
        assertNotNull(dictionaryList);
    }

    @Test
    public void testDictionaryListInstance() {
        DictionaryList newDictionaryList = new DictionaryList();
        assertNotNull(newDictionaryList);
    }
}
