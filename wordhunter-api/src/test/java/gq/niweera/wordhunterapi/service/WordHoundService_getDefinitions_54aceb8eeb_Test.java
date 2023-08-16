package gq.niweera.wordhunterapi.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import gq.niweera.wordhunterapi.model.Dictionary;
import gq.niweera.wordhunterapi.proxy.WordHoundProxy;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class WordHoundService_getDefinitions_54aceb8eeb_Test {

    @Mock
    private WordHoundProxy wordHoundProxy;

    @InjectMocks
    private WordHoundService wordHoundService;

    @BeforeEach
    public void setup() {
        when(wordHoundProxy.getDefinitionFromWordHound(any(String.class)))
                .thenReturn(Mono.just(new Dictionary("word", "definition")));
    }

    @Test
    public void testGetDefinitions() {
        List<String> anagramsList = Arrays.asList("word1", "word2");
        Flux<Dictionary> result = wordHoundService.getDefinitions(anagramsList);

        StepVerifier.create(result)
                .expectNextMatches(dictionary -> dictionary.getWord().equals("word") && dictionary.getDefinition().equals("definition"))
                .expectNextMatches(dictionary -> dictionary.getWord().equals("word") && dictionary.getDefinition().equals("definition"))
                .verifyComplete();
    }

    @Test
    public void testGetDefinitionsWhenExceptionOccurs() {
        when(wordHoundProxy.getDefinitionFromWordHound(any(String.class)))
                .thenThrow(new RuntimeException());

        List<String> anagramsList = Arrays.asList("word1", "word2");
        Flux<Dictionary> result = wordHoundService.getDefinitions(anagramsList);

        StepVerifier.create(result)
                .verifyComplete();
    }
}
