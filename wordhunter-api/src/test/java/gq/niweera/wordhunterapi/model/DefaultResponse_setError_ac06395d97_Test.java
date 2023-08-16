package gq.niweera.wordhunterapi.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DefaultResponse_setError_ac06395d97_Test {

    private DefaultResponse defaultResponse;

    @BeforeEach
    public void setUp() {
        defaultResponse = new DefaultResponse();
    }

    @Test
    public void testSetError() {
        String error = "Test Error";
        defaultResponse.setError(error);
        assertEquals(error, defaultResponse.getError());
    }

    @Test
    public void testSetErrorWithNull() {
        String error = null;
        defaultResponse.setError(error);
        assertEquals(error, defaultResponse.getError());
    }
}
