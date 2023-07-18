package gq.niweera.wordhound.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DefaultResponse_DefaultResponse_acde6cd038_Test {
    private DefaultResponse defaultResponse;

    @BeforeEach
    public void setup() {
        defaultResponse = new DefaultResponse();
        defaultResponse.setError("Error Message");
        defaultResponse.setEndpoint("http://wordhound/definition/{word}");
        defaultResponse.setNote("Provide the word to get the definition");
    }

    @Test
    public void testDefaultResponseError() {
        assertEquals("Error Message", defaultResponse.getError());
    }

    @Test
    public void testDefaultResponseEndpoint() {
        assertEquals("http://wordhound/definition/{word}", defaultResponse.getEndpoint());
    }

    @Test
    public void testDefaultResponseNote() {
        assertEquals("Provide the word to get the definition", defaultResponse.getNote());
    }
}
