package com.duolingo.entities;

import java.util.Objects;

public class Word {
    private String lemma;

    private String initial;
    private String category;
    private String definition;

    public Word(String lemma, String category, String definition) {
        this.lemma = lemma;
        this.initial = String.valueOf(lemma.charAt(0));
        this.category = category;
        this.definition = definition;
    }

    public String getLemma() {
        return this.lemma;
    }

    public String getInitial() {
        return this.initial;
    }


    @Override
    public String toString() {
        return "\n" + this.lemma + "\n" +
                "---------------------------------\n" +
                "* Category: " + this.category + "\n" +
                "* Definition: " + this.definition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Word word = (Word) o;
        return Objects.equals(lemma, word.lemma);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lemma);
    }
}
