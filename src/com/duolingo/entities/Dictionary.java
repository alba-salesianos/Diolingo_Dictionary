package com.duolingo.entities;

import java.util.*;

public class Dictionary {
    private Map<String, Set<Word>> wordsList = new HashMap<>();

    public void addToDictionary(String lemma, String category, String definition) {
        Word newWord = new Word(lemma, category, definition);

        if (this.wordsList.containsKey(newWord.getInitial())) {
            this.wordsList.get(newWord.getInitial()).add(newWord);
        } else {
            Set<Word> newSet = new HashSet<>();
            this.wordsList.put(newWord.getInitial(), newSet);
            this.wordsList.get(newWord.getInitial()).add(newWord);
        }
    }

    public String deleteWord(String word) {
        String msg = "This word is not in the dictionary.";

        if (this.wordsList.get(word.substring(0, 1)) != null) {
            Iterator<Word> initialsIterator = this.wordsList.get(word.substring(0, 1)).iterator();
            while (initialsIterator.hasNext()) {
                if (initialsIterator.next().getLemma().equals(word)) {
                    initialsIterator.remove();
                    msg = "Word deleted successfully.";
                }
            }
        }
        return msg;
    }

    public String wordExists(String word) {
        String msg = "This word is not in the dictionary.";
        if (this.wordsList.get(word.substring(0, 1)) != null) {
            msg = "This word is not in the dictionary.";
        }
        return msg;
    }

    public String displayWords(String initial) {
        String msg = this.wordsList.get(initial).toString().replace("{", "").replace("}", "");
        msg = msg.replace("[", "").replace("]", "").replace(",", "\n");
        return msg;
    }

    public String displayInitials() {
        String msg = "Available initials:\n- ";
        msg += this.wordsList.keySet().toString().replace("[", "").replace("]", "").replace(",", "\n-");
        return msg;
    }


}
