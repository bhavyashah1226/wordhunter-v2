package gq.niweera.wordhound.service;

import gq.niweera.wordhound.model.Dictionary;
import gq.niweera.wordhound.proxy.GoogleDictProxy;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class GoogleDictService_getFromGoogleDict_bb76592d98_Test {

    @InjectMocks
    GoogleDictService googleDictService;

    @Mock
    GoogleDictProxy googleDictProxy;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetFromGoogleDict_Success() {
        Dictionary dictionary = new Dictionary();
        dictionary.setWord("test");

        when(googleDictProxy.getGoogleDictDefinition("test")).thenReturn(dictionary);

        Dictionary result = googleDictService.getFromGoogleDict("test");

        assertNotNull(result);
        assertEquals(result.getWord(), "test");
    }

    @Test
    public void testGetFromGoogleDict_Null() {
        when(googleDictProxy.getGoogleDictDefinition("test")).thenReturn(null);

        Dictionary result = googleDictService.getFromGoogleDict("test");

        assertNull(result);
    }

    @Test
    public void testGetFromGoogleDict_NotFound() {
        Dictionary dictionary = new Dictionary();
        dictionary.setWord("not-found-error");

        when(googleDictProxy.getGoogleDictDefinition("test")).thenReturn(dictionary);

        Dictionary result = googleDictService.getFromGoogleDict("test");

        assertNotEquals(result.getWord(), "not-found-error");
    }
}
