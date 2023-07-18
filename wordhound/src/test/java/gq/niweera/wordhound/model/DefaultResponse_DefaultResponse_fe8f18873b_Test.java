package gq.niweera.wordhound.model;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DefaultResponse_DefaultResponse_fe8f18873b_Test {

    private DefaultResponse defaultResponse;

    @Before
    public void setUp() {
        defaultResponse = new DefaultResponse();
    }

    @Test
    public void testDefaultResponseConstructorSuccess() {
        String error = "No Error";
        String endpoint = "Test Endpoint";
        String note = "Test Note";

        defaultResponse.setError(error);
        defaultResponse.setEndpoint(endpoint);
        defaultResponse.setNote(note);

        assertEquals("Error should match", error, defaultResponse.getError());
        assertEquals("Endpoint should match", endpoint, defaultResponse.getEndpoint());
        assertEquals("Note should match", note, defaultResponse.getNote());
    }

    @Test
    public void testDefaultResponseConstructorFailure() {
        String error = "Error Occurred";
        String endpoint = null;
        String note = null;

        defaultResponse.setError(error);
        defaultResponse.setEndpoint(endpoint);
        defaultResponse.setNote(note);

        assertEquals("Error should match", error, defaultResponse.getError());
        assertEquals("Endpoint should be null", endpoint, defaultResponse.getEndpoint());
        assertEquals("Note should be null", note, defaultResponse.getNote());
    }
}
