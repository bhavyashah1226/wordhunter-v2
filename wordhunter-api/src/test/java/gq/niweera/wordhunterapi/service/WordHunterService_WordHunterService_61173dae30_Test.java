package gq.niweera.wordhunterapi.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordHunterService_WordHunterService_61173dae30_Test {
    private WordHoundService wordHoundService;
    private EnygmaService enygmaService;
    private WordHunterService wordHunterService;

    @BeforeEach
    public void setUp() {
        wordHoundService = Mockito.mock(WordHoundService.class);
        enygmaService = Mockito.mock(EnygmaService.class);
        wordHunterService = new WordHunterService(wordHoundService, enygmaService);
    }

    @Test
    public void testWordHunterService_WithValidServices() {
        assertEquals(wordHoundService, wordHunterService.getWordHoundService());
        assertEquals(enygmaService, wordHunterService.getEnygmaService());
    }

    @Test
    public void testWordHunterService_WithNullServices() {
        WordHunterService wordHunterService = new WordHunterService(null, null);
        assertEquals(null, wordHunterService.getWordHoundService());
        assertEquals(null, wordHunterService.getEnygmaService());
    }
}
