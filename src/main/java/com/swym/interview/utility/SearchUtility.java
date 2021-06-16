package com.swym.interview.utility;

import java.util.ArrayList;
import java.util.List;

public class SearchUtility {

    public static long generateSimilarityScore(String word1, String word2) {

        List<String> set1 = pairs(word1.toUpperCase());
        List<String> set2 = pairs(word2.toUpperCase());

        long numOfIntersection = set1.stream()
                .filter(set2::contains)
                .count();

        return (numOfIntersection * 200) / (set1.size() + set2.size());
    }

    private static List<String> pairs(String word) {
        List<String> pairOfLetters = new ArrayList<>();
        for (int i = 0; i < word.length() - 1; i++)
            pairOfLetters.add(word.substring(i, 2 + i));

        return pairOfLetters;
    }

}
