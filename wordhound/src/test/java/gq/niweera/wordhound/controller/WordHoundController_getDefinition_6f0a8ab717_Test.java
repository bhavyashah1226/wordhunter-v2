package gq.niweera.wordhound.controller;

import gq.niweera.wordhound.model.Dictionary;
import gq.niweera.wordhound.service.WordHoundService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.web.server.ResponseStatusException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class WordHoundController_getDefinition_6f0a8ab717_Test {
    @Mock
    private WordHoundService wordHoundService;

    @InjectMocks
    private WordHoundController wordHoundController;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetDefinition_Success() {
        Dictionary dictionary = new Dictionary();
        dictionary.setWord("test");
        dictionary.setDefinition("a procedure intended to establish the quality, performance, or reliability of something");
        when(wordHoundService.getDefinition("test")).thenReturn(dictionary);

        Dictionary result = wordHoundController.getDefinition("test");
        assertEquals("test", result.getWord());
        assertEquals("a procedure intended to establish the quality, performance, or reliability of something", result.getDefinition());
    }

    @Test
    public void testGetDefinition_Error() {
        when(wordHoundService.getDefinition("test")).thenThrow(new RuntimeException());

        assertThrows(ResponseStatusException.class, () -> wordHoundController.getDefinition("test"));
    }
}
