package com.swym.interview.model;

public class Word {
    private String word;
    private String summary;

    public Word() {
    }

    public Word(String word, String summary) {
        this.word = word;
        this.summary = summary;
    }

    public String getWord() {
        return word;
    }

    public String getSummary() {
        return summary;
    }

    @Override
    public String toString() {
        return "word='" + word + '\'' +
                ", summary='" + summary + '\'' +
                '}';
    }
}
