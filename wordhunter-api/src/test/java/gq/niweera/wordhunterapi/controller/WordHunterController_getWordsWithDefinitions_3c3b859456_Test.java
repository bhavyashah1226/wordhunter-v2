package gq.niweera.wordhunterapi.controller;

import gq.niweera.wordhunterapi.model.DefaultResponse;
import gq.niweera.wordhunterapi.model.Dictionary;
import gq.niweera.wordhunterapi.service.WordHunterService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.anyString;

public class WordHunterController_getWordsWithDefinitions_3c3b859456_Test {

    @Mock
    private WordHunterService wordHunterService;

    private WordHunterController wordHunterController;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        wordHunterController = new WordHunterController();
        wordHunterController.setWordHunterService(wordHunterService);
    }

    @Test
    public void testGetWordsWithDefinitions_Success() {
        Dictionary dictionary = new Dictionary();
        dictionary.setWord("test");
        dictionary.setDefinition("a procedure intended to establish the quality, performance, or reliability of something, especially before it is taken into widespread use.");

        when(wordHunterService.getWordsWithDefinitions(anyString())).thenReturn(Flux.just(dictionary));

        StepVerifier.create(wordHunterController.getWordsWithDefinitions("test"))
                .expectNext(dictionary)
                .verifyComplete();
    }

    @Test
    public void testGetWordsWithDefinitions_Failure() {
        when(wordHunterService.getWordsWithDefinitions(anyString())).thenThrow(new RuntimeException());

        StepVerifier.create(wordHunterController.getWordsWithDefinitions("test"))
                .expectError(ResponseStatusException.class)
                .verify();
    }
}
