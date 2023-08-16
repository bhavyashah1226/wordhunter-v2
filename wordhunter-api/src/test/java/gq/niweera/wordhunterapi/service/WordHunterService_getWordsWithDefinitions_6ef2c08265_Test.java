package gq.niweera.wordhunterapi.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import gq.niweera.wordhunterapi.model.DefaultResponse;
import gq.niweera.wordhunterapi.model.Dictionary;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class WordHunterService_getWordsWithDefinitions_6ef2c08265_Test {

    @Mock
    private EnygmaService enygmaService;

    @Mock
    private WordHoundService wordHoundService;

    @InjectMocks
    private WordHunterService wordHunterService;

    @Test
    public void testGetWordsWithDefinitions_Success() {
        String letters = "test";
        List<String> anagramsList = Arrays.asList("test", "tset", "stet", "sett");
        Flux<Dictionary> expectedFlux = Flux.just(new Dictionary("test", "a procedure intended to establish the quality, performance, or reliability of something, especially before it is taken into widespread use."));

        when(enygmaService.getAnagramsList(letters)).thenReturn(anagramsList);
        when(wordHoundService.getDefinitions(anagramsList)).thenReturn(expectedFlux);

        Flux<Dictionary> actualFlux = wordHunterService.getWordsWithDefinitions(letters);

        StepVerifier.create(actualFlux)
                .expectNextMatches(dictionary -> dictionary.getWord().equals("test"))
                .verifyComplete();
    }

    @Test
    public void testGetWordsWithDefinitions_EmptyAnagramsList() {
        String letters = "test";
        List<String> anagramsList = Arrays.asList();

        when(enygmaService.getAnagramsList(letters)).thenReturn(anagramsList);

        Flux<Dictionary> actualFlux = wordHunterService.getWordsWithDefinitions(letters);

        StepVerifier.create(actualFlux)
                .expectComplete();
    }
}
