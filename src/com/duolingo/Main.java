package com.duolingo;

import com.duolingo.entities.Dictionary;
import com.duolingo.entities.Word;

public class Main {
    public static void main(String[] args) {

        Word word = new Word("Banco","Sustantivo");
        Word word2 = new Word("Bebé","Sustantivo");
        Word word3 = new Word("Ordenador","Sustantivo");
        Word word4 = new Word("Oveja","Sustantivo");
        Dictionary dictionary = new Dictionary();

        word.addDefinition("Sitio para sentarse");
        word.addDefinition("Empresa que causó la crisis de 2007");



        dictionary.addToDictionary(word);
        dictionary.addToDictionary(word2);
        dictionary.addToDictionary(word3);
        dictionary.addToDictionary(word4);
        System.out.println(word.getInitial());


        System.out.println(dictionary.displayInitialList());






    }
}