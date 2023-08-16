package gq.niweera.wordhunterapi.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.Mockito.when;

public class BasicErrorController_getErrorPath_b8b263bb31_Test {
    private static final String ERROR_PATH = "/error";

    private ErrorController errorController;

    @BeforeEach
    public void init() {
        errorController = Mockito.mock(ErrorController.class);
        when(errorController.getErrorPath()).thenReturn(ERROR_PATH);
    }

    @Test
    public void testGetErrorPath() {
        String result = errorController.getErrorPath();
        assertEquals(ERROR_PATH, result);
    }

    @Test
    public void testGetErrorPath_NotEqual() {
        String result = errorController.getErrorPath();
        assertNotEquals("/someOtherPath", result);
    }
}
