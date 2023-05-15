package com.duolingo.entities;

import org.jetbrains.annotations.NotNull;

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

    public void deleteWord(String word) {
        Iterator<Word> initialsIterator =  wordsList.get(word.substring(0,1)).iterator();

        while(initialsIterator.hasNext()) {
            initialsIterator.next();
            if(initialsIterator.next().getLemma().equals(word)) {
                initialsIterator.remove();
                System.out.println("Se ha eliminado la palabra.");
            }
        }
    }

    public String displayWords(String initial) {
        return wordsList.get(initial).toString().replace("{", "").replace("}", "");
    }

    public String displayInitials(){
        String msg = "- ";
        msg += wordsList.keySet().toString().replace("[","").replace("]","").replace(",","\n-");
        return msg;
    }




}
