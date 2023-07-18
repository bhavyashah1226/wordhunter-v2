// Dictionary class file
package gq.niweera.wordhound.model;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document(collection = "dictionary")
public class Dictionary implements Serializable {

    @Indexed(unique = true)
    private String word;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
}
