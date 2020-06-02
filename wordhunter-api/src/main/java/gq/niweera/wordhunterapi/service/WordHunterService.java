package gq.niweera.wordhunterapi.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import gq.niweera.wordhunterapi.model.DefaultResponse;
import gq.niweera.wordhunterapi.model.Dictionary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.List;

@Service
public class WordHunterService {
    private final WordHoundService wordHoundService;
    private final EnygmaService enygmaService;

    @Autowired
    public WordHunterService(WordHoundService wordHoundService, EnygmaService enygmaService) {
        this.wordHoundService = wordHoundService;
        this.enygmaService = enygmaService;
    }

    @HystrixCommand(fallbackMethod = "getFallbackWordsWithDefinitions",
            commandKey = "wordHunterServiceCommand",
            commandProperties = {
                    @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "25000"),
                    @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "100"),
                    @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "50"),
                    @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "5000")
            }, threadPoolKey = "wordHunterServicePool",
            threadPoolProperties = {
                    @HystrixProperty(name = "coreSize", value = "20"),
                    @HystrixProperty(name = "maxQueueSize", value = "10")
            })
    public Flux<Dictionary> getWordsWithDefinitions(String letters) {
        List<String> anagramsList = enygmaService.getAnagramsList(letters);
        if (!anagramsList.isEmpty()) {
            return wordHoundService.getDefinitions(anagramsList);
        } else {
            return null;
        }
    }

    public Flux<Dictionary> getFallbackWordsWithDefinitions(String letters) {
        return null;
    }

    public DefaultResponse getRootEndpoint() {
        return new DefaultResponse("No characters are given!");
    }
}
