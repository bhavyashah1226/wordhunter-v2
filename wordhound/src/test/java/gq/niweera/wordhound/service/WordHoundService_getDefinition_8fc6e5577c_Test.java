package gq.niweera.wordhound.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import gq.niweera.wordhound.model.DefaultResponse;
import gq.niweera.wordhound.model.Dictionary;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class WordHoundService_getDefinition_8fc6e5577c_Test {

    @Mock
    private WordCacheService wordCacheService;

    @Mock
    private GoogleDictService googleDictService;

    @InjectMocks
    private WordHoundService wordHoundService;

    @Test
    public void testGetDefinition_WordInCache() {
        String word = "test";
        Dictionary expectedDictionary = new Dictionary(word, "A procedure intended to establish the quality, performance, or reliability of something, especially before it is taken into widespread use.");
        when(wordCacheService.getDefinitionFormWordCache(word)).thenReturn(expectedDictionary);
        Dictionary actualDictionary = wordHoundService.getDefinition(word);
        assertEquals(expectedDictionary, actualDictionary);
    }

    @Test
    public void testGetDefinition_WordNotInCacheButInGoogleDict() {
        String word = "test";
        Dictionary expectedDictionary = new Dictionary(word, "A procedure intended to establish the quality, performance, or reliability of something, especially before it is taken into widespread use.");
        when(wordCacheService.getDefinitionFormWordCache(word)).thenReturn(null);
        when(googleDictService.getFromGoogleDict(word)).thenReturn(expectedDictionary);
        Dictionary actualDictionary = wordHoundService.getDefinition(word);
        assertEquals(expectedDictionary, actualDictionary);
    }

    @Test
    public void testGetDefinition_WordNotInCacheNorInGoogleDict() {
        String word = "test";
        Dictionary expectedDictionary = new Dictionary(word, "Definition not found");
        when(wordCacheService.getDefinitionFormWordCache(word)).thenReturn(null);
        when(googleDictService.getFromGoogleDict(word)).thenReturn(null);
        Dictionary actualDictionary = wordHoundService.getDefinition(word);
        assertEquals(expectedDictionary, actualDictionary);
    }
}
