package gq.niweera.wordhound.service;

import gq.niweera.wordhound.model.Dictionary;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GoogleDictService_getFallbackFromGoogleDict_532d630bbc_Test {

    private GoogleDictService googleDictService;

    @BeforeEach
    public void setUp() {
        googleDictService = mock(GoogleDictService.class);
    }

    @Test
    public void testGetFallbackFromGoogleDict_NullWord() {
        String word = null;
        when(googleDictService.getFallbackFromGoogleDict(word)).thenReturn(null);
        Dictionary result = googleDictService.getFallbackFromGoogleDict(word);
        assertNull(result);
    }

    @Test
    public void testGetFallbackFromGoogleDict_EmptyWord() {
        String word = "";
        when(googleDictService.getFallbackFromGoogleDict(word)).thenReturn(null);
        Dictionary result = googleDictService.getFallbackFromGoogleDict(word);
        assertNull(result);
    }
}
