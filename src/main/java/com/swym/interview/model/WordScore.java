package com.swym.interview.model;

import java.util.Comparator;

public class WordScore {
    private Word word;
    private Long score;

    public WordScore(Word word, Long score) {
        this.word = word;
        this.score = score;
    }

    public Word getWord() {
        return word;
    }

    public Long getScore() {
        return score;
    }

    public static final Comparator<WordScore> sortByScoreDesc = (WordScore w1,
                                                                 WordScore w2) -> {
        return w2.getScore().compareTo(w1.getScore());
    };

}
