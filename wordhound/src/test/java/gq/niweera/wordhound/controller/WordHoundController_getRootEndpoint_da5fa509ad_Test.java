package gq.niweera.wordhound.controller;

import gq.niweera.wordhound.model.DefaultResponse;
import gq.niweera.wordhound.service.WordHoundService;
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

public class WordHoundController_getRootEndpoint_da5fa509ad_Test {

    @InjectMocks
    private WordHoundController wordHoundController;

    @Mock
    private WordHoundService wordHoundService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetRootEndpoint_success() {
        DefaultResponse expectedResponse = new DefaultResponse();
        expectedResponse.setMessage("Success");

        when(wordHoundService.getRootEndpoint()).thenReturn(expectedResponse);

        DefaultResponse actualResponse = wordHoundController.getRootEndpoint();

        assertEquals(expectedResponse, actualResponse);
    }

    @Test
    public void testGetRootEndpoint_failure() {
        when(wordHoundService.getRootEndpoint()).thenThrow(new RuntimeException());

        Exception exception = assertThrows(Exception.class, () -> wordHoundController.getRootEndpoint());

        assertEquals("java.lang.RuntimeException", exception.getClass().getName());
    }
}
