package gq.niweera.wordhound.service;

import gq.niweera.wordhound.model.Dictionary;
import gq.niweera.wordhound.repository.DictionaryRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;

public class WordCacheService_saveDefinitionInWordCache_452037cd44_Test {

    @InjectMocks
    private WordCacheService wordCacheService;

    @Mock
    private DictionaryRepository dictionaryRepository;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testSaveDefinitionInWordCache() {
        Dictionary newDefinition = new Dictionary();
        newDefinition.setWord("test");
        newDefinition.setDefinition("a procedure intended to establish the quality, performance, or reliability of something, especially before it is taken into widespread use.");

        wordCacheService.saveDefinitionInWordCache(newDefinition);

        verify(dictionaryRepository, times(1)).save(newDefinition);
    }

    @Test
    public void testSaveDefinitionInWordCache_NullDefinition() {
        Dictionary newDefinition = new Dictionary();
        newDefinition.setWord("test");
        newDefinition.setDefinition(null);

        wordCacheService.saveDefinitionInWordCache(newDefinition);

        verify(dictionaryRepository, times(1)).save(newDefinition);
    }
}
