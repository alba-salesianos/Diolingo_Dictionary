package com.duolingo.entities;

import java.util.ArrayList;

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
        return "\n" + lemma + "\n" +
                "---------------------------------\n" +
                "* Categoría: " + category + "\n" +
                "* Definición: " + definition;
    }
}
