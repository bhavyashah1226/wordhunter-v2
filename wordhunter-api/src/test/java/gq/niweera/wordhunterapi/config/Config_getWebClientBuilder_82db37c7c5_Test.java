package gq.niweera.wordhunterapi.config;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.web.reactive.function.client.WebClient;

import static org.junit.jupiter.api.Assertions.*;

class Config_getWebClientBuilder_82db37c7c5_Test {

    @InjectMocks
    private Config_getWebClientBuilder_82db37c7c5 config;

    @BeforeEach
    void setUp() {
        config = new Config_getWebClientBuilder_82db37c7c5();
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testGetWebClientBuilder_NotNull() {
        WebClient.Builder builder = config.getWebClientBuilder();
        assertNotNull(builder, "WebClient.Builder object should not be null");
    }

    @Test
    void testGetWebClientBuilder_DefaultValues() {
        WebClient.Builder builder = config.getWebClientBuilder();
        assertNotNull(builder.build(), "WebClient object should not be null");
    }
}
