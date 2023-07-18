package gq.niweera.wordhound.controller;

import gq.niweera.wordhound.service.WordHoundService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class WordHoundControllerTest {

    @InjectMocks
    WordHoundController wordHoundController;

    @Mock
    WordHoundService wordHoundService;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testWordHoundController_Success() {
        assertNotNull(wordHoundController);
    }

    @Test
    public void testWordHoundController_Null() {
        assertThrows(NullPointerException.class, () -> {
            WordHoundController wordHoundController = null;
            wordHoundController.getWord("test");
        });
    }
}
