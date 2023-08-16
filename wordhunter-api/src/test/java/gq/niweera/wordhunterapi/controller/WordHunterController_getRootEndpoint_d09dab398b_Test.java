package gq.niweera.wordhunterapi.controller;

import gq.niweera.wordhunterapi.model.DefaultResponse;
import gq.niweera.wordhunterapi.service.WordHunterService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

public class WordHunterController_getRootEndpoint_d09dab398b_Test {

    @InjectMocks
    private WordHunterController wordHunterController;

    @Mock
    private WordHunterService wordHunterService;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetRootEndpoint_Success() {
        DefaultResponse expectedResponse = new DefaultResponse();
        expectedResponse.setMessage("Success");
        expectedResponse.setDescription("Root endpoint reached successfully");
        when(wordHunterService.getRootEndpoint()).thenReturn(expectedResponse);

        DefaultResponse actualResponse = wordHunterController.getRootEndpoint();

        assertEquals(expectedResponse, actualResponse);
    }

    @Test
    public void testGetRootEndpoint_Failure() {
        when(wordHunterService.getRootEndpoint()).thenThrow(new RuntimeException());

        ResponseStatusException responseStatusException = assertThrows(ResponseStatusException.class, () -> wordHunterController.getRootEndpoint());

        assertEquals(HttpStatus.INTERNAL_SERVER_ERROR, responseStatusException.getStatus());
        assertEquals("Internal Server Error", responseStatusException.getReason());
    }
}
