package com.swym.interview.utility;

import com.swym.interview.model.Word;
import org.apache.commons.lang3.StringUtils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestUtility {
    public static List<Word> parseWordsFromTheFile(String path) throws IOException {
        try {
            final BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            final List<Word> words = new ArrayList<>();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (!StringUtils.isEmpty(line)) {
                    String[] tokenArr = line.split(" ", 2);
                    if(tokenArr.length > 1){
                        words.add(new Word(tokenArr[0], tokenArr[1]));
                    }
                }
            }
            return words;
        } catch (FileNotFoundException e) {
            throw e;
        }
    }
}
