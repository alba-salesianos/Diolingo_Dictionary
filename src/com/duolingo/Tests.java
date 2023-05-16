package com.duolingo;

import com.duolingo.entities.Dictionary;
import com.duolingo.entities.Word;

public class Tests {
    public static void main(String[] args) {

        Dictionary dictionary = new Dictionary();


        dictionary.addToDictionary("Banco","Sustantivo","a");
        dictionary.addToDictionary("Bebé","Sustantivo","a");
        dictionary.addToDictionary("Ordenador","Sustantivo","a");
        dictionary.addToDictionary("Oveja","Sustantivo","a");
        //System.out.println(word.getInitial());


        System.out.println(dictionary.displayWords("B"));
        dictionary.deleteWord("Banco");

        System.out.println("\n\n\n");
        System.out.println(dictionary.displayWords("B"));
        dictionary.wordExists("Bebé");
        //System.out.println(dictionary.displayInitials());
    }
}
