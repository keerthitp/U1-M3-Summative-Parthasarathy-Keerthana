package com.company.QuoteWord;

public class WordDefinition {
    private String word;
    private String definition;

    public WordDefinition(String word, String definition) {
        this.word = word;
        this.definition = definition;
    }

    public WordDefinition() {
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }
}
