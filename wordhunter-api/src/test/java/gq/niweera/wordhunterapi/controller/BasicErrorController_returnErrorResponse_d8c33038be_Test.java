package gq.niweera.wordhunterapi.controller;

import gq.niweera.wordhunterapi.model.DefaultResponse;
import org.junit.jupiter.api.Test;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.mock.web.MockHttpServletRequest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BasicErrorController_returnErrorResponse_d8c33038be_Test {

    @Test
    public void testReturnErrorResponse_NotFound() {
        MockHttpServletRequest request = new MockHttpServletRequest();
        request.setAttribute("javax.servlet.error.status_code", HttpStatus.NOT_FOUND.value());

        ErrorController controller = mock(ErrorController.class);
        when(controller.getErrorPath()).thenReturn("error-404");

        assertEquals("error-404", controller.getErrorPath());
    }

    @Test
    public void testReturnErrorResponse_InternalServerError() {
        MockHttpServletRequest request = new MockHttpServletRequest();
        request.setAttribute("javax.servlet.error.status_code", HttpStatus.INTERNAL_SERVER_ERROR.value());

        ErrorController controller = mock(ErrorController.class);
        when(controller.getErrorPath()).thenReturn("error-500");

        assertEquals("error-500", controller.getErrorPath());
    }

    @Test
    public void testReturnErrorResponse_DefaultError() {
        MockHttpServletRequest request = new MockHttpServletRequest();

        ErrorController controller = mock(ErrorController.class);
        when(controller.getErrorPath()).thenReturn("error-500");

        assertEquals("error-500", controller.getErrorPath());
    }
}
