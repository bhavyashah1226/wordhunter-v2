package gq.niweera.wordhunterapi.service;

import gq.niweera.wordhunterapi.model.Dictionary;
import gq.niweera.wordhunterapi.proxy.WordHoundProxy;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import reactor.core.publisher.Flux;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class WordHoundService_getFallbackDefinitions_c1339e93af_Test {

    @Mock
    private WordHoundProxy wordHoundProxy;

    @InjectMocks
    private WordHoundService wordHoundService;

    @Test
    public void testGetFallbackDefinitions_whenAnagramsListIsEmpty() {
        List<String> anagramsList = List.of();
        Flux<Dictionary> expected = Flux.empty();
        when(wordHoundProxy.getDefinitions(anagramsList)).thenReturn(expected);
        Flux<Dictionary> actual = wordHoundService.getFallbackDefinitions(anagramsList);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetFallbackDefinitions_whenAnagramsListIsNotEmpty() {
        List<String> anagramsList = List.of("dog", "god");
        Flux<Dictionary> expected = Flux.just(new Dictionary(), new Dictionary());
        when(wordHoundProxy.getDefinitions(anagramsList)).thenReturn(expected);
        Flux<Dictionary> actual = wordHoundService.getFallbackDefinitions(anagramsList);
        assertEquals(expected, actual);
    }
}
