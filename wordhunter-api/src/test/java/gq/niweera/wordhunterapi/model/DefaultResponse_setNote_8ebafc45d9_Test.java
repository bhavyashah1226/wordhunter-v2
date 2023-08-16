package gq.niweera.wordhunterapi.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class DefaultResponse_setNote_8ebafc45d9_Test {

    private DefaultResponse defaultResponse;

    @BeforeEach
    public void setup() {
        defaultResponse = new DefaultResponse();
    }

    @Test
    public void testSetNote() {
        String note = "Test Note";
        defaultResponse.setNote(note);
        assertEquals(note, defaultResponse.getNote());
    }

    @Test
    public void testSetNoteNull() {
        defaultResponse.setNote(null);
        assertNull(defaultResponse.getNote());
    }
}
