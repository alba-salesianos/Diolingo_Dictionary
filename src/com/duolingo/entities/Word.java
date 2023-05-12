package com.duolingo.entities;

import java.util.ArrayList;

public class Word {
    private String lemma;

    private String initial;
    private String category;
    private ArrayList<String> definition = new ArrayList<>();

    public Word(String lemma, String category) {
        this.lemma = lemma;
        this.initial = String.valueOf(lemma.charAt(0));
        this.category = category;
    }

    public String getLemma() {
        return this.lemma;
    }

    public String getInitial() {
        return this. initial;
    }

    public String getCategory() {
        return this.category;
    }

    public ArrayList<String> getDefinition() {
        return this.definition;
    }

    public void addDefinition(String definitions){
        definition.add(definitions);
    }

    public String displayDefinitions(){
        String msg = "  - ";

        msg += definition.toString().replace("[","").replace("]","").replace(",","\n  -");
        return msg;
    }

    @Override
    public String toString() {
        String msg ="\n" + lemma + "\n" +
                "---------------------------------\n" +
                "* Categoría: " + category + "\n" +
                "* Definición:\n" + displayDefinitions();
        return msg;
    }
}
