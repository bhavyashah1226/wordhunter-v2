package gq.niweera.wordhound.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DefaultResponse_setEndpoint_7c2c01c1cb_Test {
    private DefaultResponse defaultResponse;

    @BeforeEach
    public void setUp() {
        defaultResponse = new DefaultResponse();
    }

    @Test
    public void testSetEndpointSuccess() {
        String expectedEndpoint = "http://test.com";
        defaultResponse.setEndpoint(expectedEndpoint);
        assertEquals(expectedEndpoint, defaultResponse.getEndpoint());
    }

    @Test
    public void testSetEndpointNull() {
        String expectedEndpoint = null;
        defaultResponse.setEndpoint(expectedEndpoint);
        assertNull(defaultResponse.getEndpoint());
    }

    // TODO: Add more test cases as needed
}
