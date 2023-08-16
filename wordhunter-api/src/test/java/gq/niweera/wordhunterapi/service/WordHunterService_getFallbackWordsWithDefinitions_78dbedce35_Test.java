package gq.niweera.wordhunterapi.service;

import gq.niweera.wordhunterapi.model.Dictionary;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import reactor.core.publisher.Flux;

@ExtendWith(MockitoExtension.class)
public class WordHunterService_getFallbackWordsWithDefinitions_78dbedce35_Test {

    @Mock
    private WordHunterService wordHunterService;

    @Test
    public void testGetFallbackWordsWithDefinitions_Success() {
        String letters = "abc";
        Dictionary dictionary = new Dictionary("abc", "definition of abc");
        Flux<Dictionary> expectedOutput = Flux.just(dictionary);

        Mockito.when(wordHunterService.getFallbackWordsWithDefinitions(Mockito.anyString())).thenReturn(expectedOutput);

        Flux<Dictionary> actualOutput = wordHunterService.getFallbackWordsWithDefinitions(letters);

        Assertions.assertEquals(expectedOutput.blockFirst().getWord(), actualOutput.blockFirst().getWord());
    }

    @Test
    public void testGetFallbackWordsWithDefinitions_Failure() {
        String letters = "abc";
        Flux<Dictionary> expectedOutput = Flux.empty();

        Mockito.when(wordHunterService.getFallbackWordsWithDefinitions(Mockito.anyString())).thenReturn(expectedOutput);

        Flux<Dictionary> actualOutput = wordHunterService.getFallbackWordsWithDefinitions(letters);

        Assertions.assertEquals(expectedOutput.blockFirst(), actualOutput.blockFirst());
    }
}
