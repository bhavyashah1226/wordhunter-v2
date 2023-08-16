package gq.niweera.wordhunterapi.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import gq.niweera.wordhunterapi.model.Anagram;
import gq.niweera.wordhunterapi.proxy.EnygmaProxy;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class EnygmaService_EnygmaService_39f7e40ac5_Test {

    @Mock
    EnygmaProxy enygmaProxy;

    @InjectMocks
    EnygmaService enygmaService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testEnygmaServiceSuccess() {
        EnygmaService enygmaService = new EnygmaService();
        assertNotNull(enygmaService);
    }

    @Test
    public void testEnygmaServiceFailure() {
        try {
            EnygmaService enygmaService = new EnygmaService();
            enygmaService.setEnygmaProxy(null);
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("EnygmaProxy is required", e.getMessage());
        }
    }
}
