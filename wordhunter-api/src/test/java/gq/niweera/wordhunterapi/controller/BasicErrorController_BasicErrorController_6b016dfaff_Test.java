package gq.niweera.wordhunterapi.controller;

import gq.niweera.wordhunterapi.model.DefaultResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.servlet.http.HttpServletRequest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class BasicErrorController_BasicErrorController_6b016dfaff_Test {

    @Mock
    private BasicErrorController errorController;

    @Mock
    private HttpServletRequest httpServletRequest;

    @Mock
    private DefaultResponse defaultResponse;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testHandleError() throws Exception {
        when(httpServletRequest.getAttribute("javax.servlet.error.status_code")).thenReturn(404);
        when(errorController.handleError(httpServletRequest)).thenReturn(new ResponseEntity<>(defaultResponse, HttpStatus.NOT_FOUND));

        ResponseEntity<DefaultResponse> responseEntity = errorController.handleError(httpServletRequest);

        assertEquals(HttpStatus.NOT_FOUND, responseEntity.getStatusCode());
        assertEquals(defaultResponse, responseEntity.getBody());
    }

    @Test
    public void testGetErrorPath() {
        String errorPath = "/error";

        when(errorController.getErrorPath()).thenReturn(errorPath);

        String returnedErrorPath = errorController.getErrorPath();

        assertEquals(errorPath, returnedErrorPath);
    }
}
