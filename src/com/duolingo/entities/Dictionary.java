package com.duolingo.entities;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class Dictionary {
    private Map<String, Set<Word>> wordsList = new HashMap<>();

    public void addToDictionary(String lemma, String category, String definition) {
        Word newWord = new Word(lemma, category, definition);

        if (wordsList.containsKey(newWord.getInitial())) {
            wordsList.get(newWord.getInitial()).add(newWord);
        } else {
            Set<Word> newSet = new HashSet<>();
            wordsList.put(newWord.getInitial(), newSet);
            wordsList.get(newWord.getInitial()).add(newWord);
        }
    }

    public void deleteWord(String word) {
        if (wordsList.get(word.substring(0, 1)) == null) {
            System.out.println("Esta palabra no está en el diccionario.");
        } else {
        Iterator<Word> initialsIterator = wordsList.get(word.substring(0, 1)).iterator();
        while (initialsIterator.hasNext()) {

                if (initialsIterator.next().getLemma().equals(word)) {
                    initialsIterator.remove();
                    System.out.println("Se ha eliminado la palabra.");
                } else {
                    System.out.println("No se ha encontrado la palabra.");
                }
            }
        }
    }

    public String wordExists(String word) {
        String msg = null;
        if (wordsList.get(word.substring(0, 1)) == null) {
            msg = "Esta palabra no está en el diccionario.";
        } else {
            for (Word item : wordsList.get(word.substring(0, 1))
            ) {
                if (wordsList.get(word.substring(0, 1)).contains(item)) {
                    msg = "Esta palabra está en el diccionario.";
                } else {
                    msg = "Esta palabra no está en el diccionario.";
                }
            }
        }
        return msg;
    }

    public String displayWords(String initial) {
        String msg = wordsList.get(initial).toString().replace("{", "").replace("}", "");
        msg = msg.replace("[", "").replace("]", "").replace(",", "\n");
        return msg;
    }

    public String displayInitials() {
        String msg = "- ";
        msg += wordsList.keySet().toString().replace("[", "").replace("]", "").replace(",", "\n-");
        return msg;
    }


}
