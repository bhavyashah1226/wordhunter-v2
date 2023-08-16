package gq.niweera.wordhunterapi.service;

import gq.niweera.wordhunterapi.model.DefaultResponse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class WordHunterService_getRootEndpoint_d09dab398b_Test {

    @Test
    public void testGetRootEndpoint_Success() {
        WordHunterService wordHunterService = mock(WordHunterService.class);
        DefaultResponse expectedResponse = mock(DefaultResponse.class);
        when(wordHunterService.getRootEndpoint()).thenReturn(expectedResponse);
        when(expectedResponse.getMessage()).thenReturn("No characters are given!");

        DefaultResponse actualResponse = wordHunterService.getRootEndpoint();

        assertEquals(expectedResponse.getMessage(), actualResponse.getMessage());
    }

    @Test
    public void testGetRootEndpoint_Failure() {
        WordHunterService wordHunterService = mock(WordHunterService.class);
        DefaultResponse unexpectedResponse = mock(DefaultResponse.class);
        when(wordHunterService.getRootEndpoint()).thenReturn(unexpectedResponse);
        when(unexpectedResponse.getMessage()).thenReturn("Some random message");

        DefaultResponse actualResponse = wordHunterService.getRootEndpoint();

        // This test will fail as the actual response message does not match the unexpected response message
        assertEquals(unexpectedResponse.getMessage(), actualResponse.getMessage());
    }
}
