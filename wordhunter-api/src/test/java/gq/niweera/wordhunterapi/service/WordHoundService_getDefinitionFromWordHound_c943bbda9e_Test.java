package gq.niweera.wordhunterapi.service;

import gq.niweera.wordhunterapi.model.Dictionary;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

public class WordHoundService_getDefinitionFromWordHound_c943bbda9e_Test {

    @InjectMocks
    private WordHoundService wordHoundService;

    @Mock
    private WebClient webClient;

    @Mock
    private WebClient.RequestHeadersUriSpec requestHeadersUriSpec;

    @Mock
    private WebClient.ResponseSpec responseSpec;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
        when(webClient.get()).thenReturn(requestHeadersUriSpec);
        when(requestHeadersUriSpec.uri(anyString())).thenReturn(requestHeadersUriSpec);
        when(requestHeadersUriSpec.retrieve()).thenReturn(responseSpec);
    }

    @Test
    public void testGetDefinitionFromWordHound_Success() {
        Dictionary dictionary = new Dictionary();
        dictionary.setWord("test");
        dictionary.setDefinition("a procedure intended to establish the quality, performance, or reliability of something");
        when(responseSpec.bodyToMono(Dictionary.class)).thenReturn(Mono.just(dictionary));

        Mono<Dictionary> result = wordHoundService.getDefinitionFromWordHound("test");

        StepVerifier.create(result)
                .expectNextMatches(dictionary1 -> dictionary1.getWord().equals("test"))
                .verifyComplete();
    }

    @Test
    public void testGetDefinitionFromWordHound_Failure() {
        when(responseSpec.bodyToMono(Dictionary.class)).thenReturn(Mono.error(new RuntimeException("Service not available")));

        Mono<Dictionary> result = wordHoundService.getDefinitionFromWordHound("test");

        StepVerifier.create(result)
                .expectErrorMatches(throwable -> throwable instanceof RuntimeException && throwable.getMessage().equals("Service not available"))
                .verify();
    }
}
