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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class EnygmaService_getAnagramsList_428f7f88d0_Test {

    @InjectMocks
    private EnygmaService enygmaService = new EnygmaService();

    @Mock
    private EnygmaProxy enygmaProxy;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetAnagramsList_Success() {
        String letters = "abc";
        Anagram anagram = new Anagram();
        anagram.setAnagrams(Arrays.asList("abc", "acb", "bac", "bca", "cab", "cba"));
        when(enygmaProxy.getAnagramsFromEnygma(letters)).thenReturn(anagram);

        List<String> expected = Arrays.asList("abc", "acb", "bac", "bca", "cab", "cba");
        List<String> actual = enygmaService.getAnagramsList(letters);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetAnagramsList_NullAnagram() {
        String letters = "abc";
        when(enygmaProxy.getAnagramsFromEnygma(letters)).thenReturn(null);

        List<String> expected = Collections.emptyList();
        List<String> actual = enygmaService.getAnagramsList(letters);
        assertEquals(expected, actual);
    }
}
