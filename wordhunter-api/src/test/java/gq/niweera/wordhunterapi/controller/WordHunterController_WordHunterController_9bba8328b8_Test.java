package gq.niweera.wordhunterapi.controller;

import gq.niweera.wordhunterapi.model.DefaultResponse;
import gq.niweera.wordhunterapi.model.Dictionary;
import gq.niweera.wordhunterapi.service.WordHunterService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import reactor.core.publisher.Flux;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

public class WordHunterController_WordHunterController_9bba8328b8_Test {

    @Mock
    private WordHunterService wordHunterService;

    private WordHunterController wordHunterController;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        wordHunterController = new WordHunterController(wordHunterService);
    }

    @Test
    public void testWordHunterControllerConstructor() {
        when(wordHunterService.getWords()).thenReturn(Flux.just(new Dictionary()));
        assertNotNull(wordHunterController);
        verify(wordHunterService).getWords();
    }

    @Test
    public void testWordHunterControllerConstructor_NullService() {
        Exception exception = null;
        try {
            new WordHunterController(null);
        } catch (Exception e) {
            exception = e;
        }
        assertNotNull(exception);
    }
}
