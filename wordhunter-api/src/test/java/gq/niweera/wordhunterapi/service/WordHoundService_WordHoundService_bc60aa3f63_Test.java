package gq.niweera.wordhunterapi.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import gq.niweera.wordhunterapi.model.Dictionary;
import gq.niweera.wordhunterapi.proxy.WordHoundProxy;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;
import java.util.List;
import java.util.stream.Collectors;
import static org.mockito.Mockito.when;

public class WordHoundService_WordHoundService_bc60aa3f63_Test {

    @Mock
    private WordHoundProxy wordHoundProxy;

    @Mock
    private WebClient.Builder webClientBuilder;

    @InjectMocks
    private WordHoundService wordHoundService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testWordHoundService() {

        when(wordHoundProxy.getWordsFromWordHound("test")).thenReturn(Flux.just(new Dictionary("test", "test definition")));

        Flux<Dictionary> dictionaryFlux = wordHoundService.getWordsFromWordHound("test");

        StepVerifier.create(dictionaryFlux)
                .expectNext(new Dictionary("test", "test definition"))
                .verifyComplete();
    }
}
