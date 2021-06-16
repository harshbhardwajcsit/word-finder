package com.swym.interview;


import com.swym.interview.model.Word;
import com.swym.interview.processor.DictionaryManager;
import com.swym.interview.utility.TestUtility;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class WordFinderTest {

    Map<String, String> dictionary;

    @Before
    public void initialize() throws Exception {
        final List<Word> words = TestUtility.parseWordsFromTheFile("src/main/resources/dictionary.txt");
        dictionary = new DictionaryManager().addWordToDictionary(words);

    }

    @Test
    public void testForExactWordMatch() throws IOException {
        String word = "Absolute";
        List<Word> searchResults = new DictionaryManager().findWordMatches(word, dictionary);
        System.out.println(searchResults);
    }

    @Test
    public void testForBestOptimalMatches() throws IOException {
        String word = "sripee";
        List<Word> searchResults = new DictionaryManager().findWordMatches(word, dictionary);
        System.out.println(searchResults);
    }
}
