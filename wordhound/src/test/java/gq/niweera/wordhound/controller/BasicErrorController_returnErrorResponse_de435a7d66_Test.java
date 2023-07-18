package gq.niweera.wordhound.controller;

import gq.niweera.wordhound.model.DefaultResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.web.servlet.error.ErrorController;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class CustomErrorController_returnErrorResponse_de435a7d66_Test {

    @InjectMocks
    private CustomErrorController customErrorController;

    @Mock
    private HttpServletRequest request;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testReturnErrorResponse_NotFound() {
        when(request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE)).thenReturn(404);

        DefaultResponse response = customErrorController.returnErrorResponse(request);

        assertEquals("error-404", response.getMessage());
    }

    @Test
    public void testReturnErrorResponse_InternalServerError() {
        when(request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE)).thenReturn(500);

        DefaultResponse response = customErrorController.returnErrorResponse(request);

        assertEquals("error-500", response.getMessage());
    }

    @Test
    public void testReturnErrorResponse_Default() {
        when(request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE)).thenReturn(null);

        DefaultResponse response = customErrorController.returnErrorResponse(request);

        assertEquals("error-500", response.getMessage());
    }
}
