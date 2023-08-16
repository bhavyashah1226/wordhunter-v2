package gq.niweera.wordhunterapi.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DefaultResponse_getNote_88a05daa78_Test {

    @Test
    public void testGetNote() {
        DefaultResponse response = new DefaultResponse();
        response.setNote("Test Note");
        String expectedNote = "Test Note";
        assertEquals(expectedNote, response.getNote());
    }

    @Test
    public void testGetNoteForNull() {
        DefaultResponse response = new DefaultResponse();
        response.setNote(null);
        assertNull(response.getNote());
    }
}
