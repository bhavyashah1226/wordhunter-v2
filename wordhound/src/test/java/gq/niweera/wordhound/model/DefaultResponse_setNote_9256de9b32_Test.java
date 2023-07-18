package gq.niweera.wordhound.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DefaultResponse_setNote_9256de9b32_Test {
    private DefaultResponse defaultResponse;

    @BeforeEach
    public void setup() {
        defaultResponse = new DefaultResponse();
    }

    @Test
    public void testSetNote() {
        String expectedNote = "Test note";
        defaultResponse.setNote(expectedNote);
        assertEquals(expectedNote, defaultResponse.getNote());
    }

    @Test
    public void testSetNoteWithNull() {
        String expectedNote = null;
        defaultResponse.setNote(expectedNote);
        assertEquals(expectedNote, defaultResponse.getNote());
    }
}
