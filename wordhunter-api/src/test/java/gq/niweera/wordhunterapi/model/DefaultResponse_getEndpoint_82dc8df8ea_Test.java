package gq.niweera.wordhunterapi.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class DefaultResponse_getEndpoint_82dc8df8ea_Test {
    private DefaultResponse defaultResponse;

    @BeforeEach
    public void setup() {
        defaultResponse = Mockito.mock(DefaultResponse.class);
    }

    @Test
    public void testGetEndpointSuccess() {
        Mockito.when(defaultResponse.getEndpoint()).thenReturn("http://example.com");
        String result = defaultResponse.getEndpoint();
        Assertions.assertEquals("http://example.com", result, "Endpoint should be http://example.com");
    }

    @Test
    public void testGetEndpointFailure() {
        Mockito.when(defaultResponse.getEndpoint()).thenReturn(null);
        String result = defaultResponse.getEndpoint();
        Assertions.assertNull(result, "Endpoint should be null");
    }
}
