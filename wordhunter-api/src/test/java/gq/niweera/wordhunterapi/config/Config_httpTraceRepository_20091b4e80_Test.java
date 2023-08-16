package gq.niweera.wordhunterapi.config;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.actuate.trace.http.HttpTraceRepository;
import org.springframework.boot.actuate.trace.http.InMemoryHttpTraceRepository;
import static org.junit.jupiter.api.Assertions.*;

public class Config_httpTraceRepository_20091b4e80_Test {
    private Config_httpTraceRepository_20091b4e80 config;

    @BeforeEach
    public void setUp() {
        config = new Config_httpTraceRepository_20091b4e80();
    }

    @Test
    public void testHttpTraceRepositoryNotNull() {
        HttpTraceRepository httpTraceRepository = config.httpTraceRepository();
        assertNotNull(httpTraceRepository, "HttpTraceRepository should not be null");
    }

    @Test
    public void testHttpTraceRepositoryInstanceType() {
        HttpTraceRepository httpTraceRepository = config.httpTraceRepository();
        assertTrue(httpTraceRepository instanceof InMemoryHttpTraceRepository, "HttpTraceRepository should be an instance of InMemoryHttpTraceRepository");
    }
}
