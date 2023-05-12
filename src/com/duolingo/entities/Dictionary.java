package com.duolingo.entities;

import java.util.*;

public class Dictionary {
    private Map<String, Set<Word>> wordsList = new HashMap<>();

    public void addToDictionary(Word word) {
        if (wordsList.containsKey(word.getInitial())) {
            wordsList.get(word.getInitial()).add(word);
        } else {
            Set<Word> newSet = new HashSet<>();
            wordsList.put(word.getInitial(), newSet);
            wordsList.get(word.getInitial()).add(word);
        }
    }


    public String displayInitialList() {
        String msg = "Palabras con la letra ";
        msg += wordsList.toString().replace("{", "").replace("}", "").replace("], ", "\n\nPalabras con la letra ");
        return msg;
    }


}
