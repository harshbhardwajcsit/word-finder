package com.swym.interview.processor;

import com.swym.interview.model.Word;

import java.util.List;
import java.util.Map;

public interface DictionaryHandler {

    /**
     * addWordToDictionary is used to prepare words and there summary/meaning in dictionary format
     * @param words
     * @return dictionary in form of key, value pair of word and its summary
     */

    Map<String, String> addWordToDictionary(List<Word> words);

    /**
     *
     * @param word
     * @param dictionary
     * @return The the word and its summary if there is an exact match available, otherwise
     * suggests 3 closely matched words to a given input word, used a simple algorithm for a pair wise character
     * match among words and generate score based on character match and in form of percentage.
     */

    List<Word> findWordMatches(String word, Map<String, String> dictionary);

}
