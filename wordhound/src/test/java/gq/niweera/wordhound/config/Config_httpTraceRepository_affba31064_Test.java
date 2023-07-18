package gq.niweera.wordhound.config;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.actuate.trace.http.HttpTraceRepository;
import org.springframework.boot.actuate.trace.http.InMemoryHttpTraceRepository;

import static org.junit.jupiter.api.Assertions.*;

class Config_httpTraceRepository_affba31064_Test {

    private Config config;

    @BeforeEach
    void setUp() {
        config = new Config();
    }

    @Test
    void testHttpTraceRepository() {
        HttpTraceRepository httpTraceRepository = config.httpTraceRepository();
        assertTrue(httpTraceRepository instanceof InMemoryHttpTraceRepository);
    }

    @Test
    void testHttpTraceRepositoryNotNull() {
        HttpTraceRepository httpTraceRepository = config.httpTraceRepository();
        assertNotNull(httpTraceRepository);
    }
}
