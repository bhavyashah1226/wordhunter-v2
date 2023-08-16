package gq.niweera.wordhunterapi.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class DefaultResponse_getError_03a9dce045_Test {

    @InjectMocks
    private DefaultResponse defaultResponse;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
        defaultResponse = new DefaultResponse();
        defaultResponse.setError("Test Error");
    }

    @Test
    public void testGetError() {
        String error = defaultResponse.getError();
        assertEquals("Test Error", error);
    }

    @Test
    public void testGetError_noErrorSet() {
        DefaultResponse response = new DefaultResponse();
        String error = response.getError();
        assertNull(error);
    }
}
