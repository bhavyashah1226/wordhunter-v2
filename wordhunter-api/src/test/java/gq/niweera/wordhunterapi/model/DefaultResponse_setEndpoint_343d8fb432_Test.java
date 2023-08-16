package gq.niweera.wordhunterapi.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DefaultResponse_setEndpoint_343d8fb432_Test {
    private DefaultResponse defaultResponse;

    @BeforeEach
    public void setup() {
        defaultResponse = new DefaultResponse();
    }

    @Test
    public void testSetEndpoint_Success() {
        String expectedEndpoint = "http://localhost:8080/api/test";
        defaultResponse.setEndpoint(expectedEndpoint);
        assertEquals(expectedEndpoint, defaultResponse.getEndpoint());
    }

    @Test
    public void testSetEndpoint_NullValue() {
        String expectedEndpoint = null;
        defaultResponse.setEndpoint(expectedEndpoint);
        assertEquals(expectedEndpoint, defaultResponse.getEndpoint());
    }
}
