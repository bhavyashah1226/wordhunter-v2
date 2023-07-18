package gq.niweera.wordhound.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import gq.niweera.wordhound.model.DefaultResponse;
import gq.niweera.wordhound.model.Dictionary;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class WordHoundService_WordHoundService_bad7462f58_Test {

    @Mock
    private GoogleDictService googleDictService;

    @Mock
    private WordCacheService wordCacheService;

    @InjectMocks
    private WordHoundService wordHoundService;

    @Before
    public void setUp() {
    }

    @Test
    public void testWordHoundServiceConstructor_Success() {
        assertNotNull(wordHoundService);
    }

    @Test
    public void testWordHoundServiceConstructor_Failure() {
        WordHoundService wordHoundService = null;
        assertNull(wordHoundService);
    }
}
