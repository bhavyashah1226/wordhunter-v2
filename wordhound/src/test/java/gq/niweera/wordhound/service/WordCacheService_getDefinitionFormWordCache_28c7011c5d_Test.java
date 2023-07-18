package gq.niweera.wordhound.service;

import gq.niweera.wordhound.model.Dictionary;
import gq.niweera.wordhound.repository.DictionaryRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.when;

public class WordCacheService_getDefinitionFormWordCache_28c7011c5d_Test {

    @InjectMocks
    private WordCacheService wordCacheService;

    @Mock
    private DictionaryRepository dictionaryRepository;

    @BeforeEach
    public void init() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetDefinitionFormWordCache_Success() {
        Dictionary dictionary = new Dictionary();
        dictionary.setWord("test");
        dictionary.setDefinition("a procedure intended to establish the quality, performance, or reliability of something, especially before it is taken into widespread use.");

        when(dictionaryRepository.findOneByWord("test")).thenReturn(dictionary);

        Dictionary result = wordCacheService.getDefinitionFormWordCache("test");

        assertEquals(dictionary, result);
    }

    @Test
    public void testGetDefinitionFormWordCache_Failure() {
        when(dictionaryRepository.findOneByWord("test")).thenReturn(null);

        Dictionary result = wordCacheService.getDefinitionFormWordCache("test");

        assertNull(result);
    }
}
