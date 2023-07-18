package gq.niweera.wordhound.service;

import gq.niweera.wordhound.model.Dictionary;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordHoundService_getFallbackDefinition_be93087ff5_Test {

    private WordHoundService wordHoundService;

    @BeforeEach
    public void setup() {
        wordHoundService = new WordHoundService();
    }

    @Test
    public void testGetFallbackDefinition_WithValidWord() {
        String word = "hello";
        Dictionary expectedResponse = new Dictionary();
        expectedResponse.setWord(word);
        expectedResponse.setDefinition("Definition not found");
        Dictionary actualResponse = wordHoundService.getFallbackDefinition(word);
        assertEquals(expectedResponse, actualResponse);
    }

    @Test
    public void testGetFallbackDefinition_WithEmptyWord() {
        String word = "";
        Dictionary expectedResponse = new Dictionary();
        expectedResponse.setWord(word);
        expectedResponse.setDefinition("Definition not found");
        Dictionary actualResponse = wordHoundService.getFallbackDefinition(word);
        assertEquals(expectedResponse, actualResponse);
    }
}
