package gq.niweera.wordhound.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class DefaultResponse_getError_2b6694279a_Test {

    private DefaultResponse defaultResponse;

    @BeforeEach
    public void setUp() {
        defaultResponse = Mockito.mock(DefaultResponse.class);
        Mockito.when(defaultResponse.getError()).thenReturn("Test error message");
    }

    @Test
    public void testGetError_Success() {
        String actualError = defaultResponse.getError();
        Assertions.assertEquals("Test error message", actualError, "Expected and actual error messages do not match");
    }

    @Test
    public void testGetError_Failure() {
        Mockito.when(defaultResponse.getError()).thenReturn(null);
        String actualError = defaultResponse.getError();
        Assertions.assertNull(actualError, "Error message should be null");
    }
}
