package gq.niweera.wordhound.service;

import gq.niweera.wordhound.model.Dictionary;
import gq.niweera.wordhound.proxy.GoogleDictProxy;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class GoogleDictServiceTest {

    @Test
    public void testGoogleDictService() {
        GoogleDictProxy mockGoogleDictProxy = Mockito.mock(GoogleDictProxy.class);
        GoogleDictService googleDictService = new GoogleDictService();
        googleDictService.setGoogleDictProxy(mockGoogleDictProxy);

        Dictionary dictionary = new Dictionary();
        dictionary.setWord("test");
        dictionary.setDefinition("a procedure intended to establish the quality, performance, or reliability of something");

        when(mockGoogleDictProxy.getWordDefinition("test")).thenReturn(dictionary);

        Dictionary result = googleDictService.getWordDefinition("test");

        assertEquals(dictionary, result);
    }

    @Test
    public void testGoogleDictService_Null() {
        GoogleDictProxy mockGoogleDictProxy = Mockito.mock(GoogleDictProxy.class);
        GoogleDictService googleDictService = new GoogleDictService();
        googleDictService.setGoogleDictProxy(mockGoogleDictProxy);

        when(mockGoogleDictProxy.getWordDefinition("test")).thenReturn(null);

        Dictionary result = googleDictService.getWordDefinition("test");

        assertEquals(null, result);
    }
}
