package gq.niweera.wordhunterapi.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DefaultResponse_DefaultResponse_1e90af2a3d_Test {

    @Mock
    private DefaultResponse defaultResponse;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testDefaultResponseError() {
        String error = "Test Error";
        when(defaultResponse.getError()).thenReturn(error);
        assertEquals(error, defaultResponse.getError());
    }

    @Test
    public void testDefaultResponseEndpoint() {
        String endpoint = "http://wordhunter-api/anagrams/{letters}";
        when(defaultResponse.getEndpoint()).thenReturn(endpoint);
        assertEquals(endpoint, defaultResponse.getEndpoint());
    }

    @Test
    public void testDefaultResponseNote() {
        String note = "Just enter the letters. No need for spaces, commas etc.";
        when(defaultResponse.getNote()).thenReturn(note);
        assertEquals(note, defaultResponse.getNote());
    }
}
