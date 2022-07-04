package VocabularyBuilder;

public class Word {
    private String word;
    private  String description;
    private  String example;

    public Word(String word, String description, String example){
        this.word = word;
        this.description = description;
        this.example = example;
    }

    public String getWord() {
        return word;
    }

    public String getDescription() {
        return description;
    }

    public String getExample() {
        return example;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setExample(String example) {
        this.example = example;
    }
}
