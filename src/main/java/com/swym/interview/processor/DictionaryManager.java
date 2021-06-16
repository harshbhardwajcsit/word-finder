package com.swym.interview.processor;

import com.swym.interview.model.Word;
import com.swym.interview.model.WordScore;
import com.swym.interview.utility.SearchUtility;

import java.util.*;
import java.util.stream.Collectors;

public class DictionaryManager implements DictionaryHandler {

    @Override
    public Map<String, String> addWordToDictionary(List<Word> words) {
        final Map<String, String> dictionary = new HashMap<>();
        words.forEach(word -> {
            dictionary.putIfAbsent(word.getWord(), word.getSummary());
        });
        return dictionary;
    }

    @Override
    public List<Word> findWordMatches(String word, Map<String, String> dictionary) {
        final List<Word> listOfWords = new ArrayList<>();
        if (dictionary.containsKey(word)) {
            listOfWords.add(new Word(word, dictionary.get(word)));
        } else {
            listOfWords.addAll(getClosedMatches(word, dictionary));
        }
        return listOfWords;
    }

    private List<Word> getClosedMatches(String word, Map<String, String> dictionary) {
        List<WordScore> wordScores = new ArrayList<>();
        dictionary.forEach((k, v) -> {
            long score = SearchUtility.generateSimilarityScore(word, k);
            wordScores.add(new WordScore(new Word(k, v), score));
        });

        Collections.sort(wordScores, WordScore.sortByScoreDesc);
        List<Word> wordSuggestions = wordScores.subList(0, 3).stream()
                .map(WordScore::getWord)
                .collect(Collectors.toList());

        return wordSuggestions;
    }
}
