package gq.niweera.wordhound.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DefaultResponse_getNote_970935044c_Test {

    @InjectMocks
    private DefaultResponse defaultResponse;

    @BeforeEach
    public void setup() {
        defaultResponse = new DefaultResponse();
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetNote_Success() {
        String expectedNote = "This is a test note";
        defaultResponse.setNote(expectedNote);
        String actualNote = defaultResponse.getNote();
        assertEquals(expectedNote, actualNote);
    }

    @Test
    public void testGetNote_Null() {
        String expectedNote = null;
        defaultResponse.setNote(expectedNote);
        String actualNote = defaultResponse.getNote();
        assertEquals(expectedNote, actualNote);
    }
}
