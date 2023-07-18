package gq.niweera.wordhound.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DefaultResponse_setError_9d7bd2012e_Test {

    private DefaultResponse defaultResponse;

    @BeforeEach
    public void setup() {
        defaultResponse = new DefaultResponse();
    }

    @Test
    public void testSetError_Success() {
        String expectedError = "Test error message";
        defaultResponse.setError(expectedError);
        assertEquals(expectedError, defaultResponse.getError());
    }

    @Test
    public void testSetError_Null() {
        String expectedError = null;
        defaultResponse.setError(expectedError);
        assertEquals(expectedError, defaultResponse.getError());
    }
}
