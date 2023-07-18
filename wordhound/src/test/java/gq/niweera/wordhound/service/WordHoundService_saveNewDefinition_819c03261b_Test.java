package gq.niweera.wordhound.test;

import gq.niweera.wordhound.service.WordHoundService;
import gq.niweera.wordhound.service.WordCacheService;
import gq.niweera.wordhound.model.Dictionary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.never;

public class WordHoundService_saveNewDefinition_819c03261b_Test {

    @InjectMocks
    private WordHoundService wordHoundService;

    @Mock
    private WordCacheService wordCacheService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testSaveNewDefinition_Success() {
        Dictionary newDefinition = new Dictionary();
        newDefinition.setWord("test");
        newDefinition.setDefinition("test definition");
        wordHoundService.saveNewDefinition(newDefinition);
        verify(wordCacheService).saveDefinitionInWordCache(newDefinition);
    }

    @Test
    public void testSaveNewDefinition_NullDefinition() {
        Dictionary newDefinition = null;
        wordHoundService.saveNewDefinition(newDefinition);
        verify(wordCacheService, never()).saveDefinitionInWordCache(newDefinition);
    }
}
