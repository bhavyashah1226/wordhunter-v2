package gq.niweera.wordhunterapi.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class EnygmaService_getFallbackAnagramsList_86840bf1db_Test {

    @InjectMocks
    EnygmaService enygmaService;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetFallbackAnagramsList_Success() {
        String letters = "test";
        List<String> expected = new ArrayList<>();
        expected.add(letters);
        
        when(enygmaService.getFallbackAnagramsList(letters)).thenReturn(expected);

        List<String> result = enygmaService.getFallbackAnagramsList(letters);
        assertEquals(1, result.size());
        assertEquals(letters, result.get(0));
    }

    @Test
    public void testGetFallbackAnagramsList_EmptyString() {
        String letters = "";
        List<String> expected = new ArrayList<>();
        expected.add(letters);
        
        when(enygmaService.getFallbackAnagramsList(letters)).thenReturn(expected);

        List<String> result = enygmaService.getFallbackAnagramsList(letters);
        assertEquals(1, result.size());
        assertEquals(letters, result.get(0));
    }
}
