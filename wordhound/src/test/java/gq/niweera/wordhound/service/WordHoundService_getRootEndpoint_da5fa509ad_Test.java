package gq.niweera.wordhound.service;

import gq.niweera.wordhound.model.DefaultResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class WordHoundService_getRootEndpoint_da5fa509ad_Test {

    @InjectMocks
    private WordHoundService wordHoundService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        wordHoundService = mock(WordHoundService.class);
    }

    @Test
    public void testGetRootEndpoint_Success() {
        DefaultResponse expectedResponse = new DefaultResponse();
        expectedResponse.setMessage("No words given");
        when(wordHoundService.getRootEndpoint()).thenReturn(expectedResponse);
        DefaultResponse actualResponse = wordHoundService.getRootEndpoint();
        assertEquals(expectedResponse.getMessage(), actualResponse.getMessage());
    }

    @Test
    public void testGetRootEndpoint_Failure() {
        DefaultResponse expectedResponse = new DefaultResponse();
        expectedResponse.setMessage("Some other message");
        when(wordHoundService.getRootEndpoint()).thenReturn(expectedResponse);
        DefaultResponse actualResponse = wordHoundService.getRootEndpoint();
        assertEquals(expectedResponse.getMessage(), actualResponse.getMessage());
    }
}
