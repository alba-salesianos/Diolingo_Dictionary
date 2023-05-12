package com.duolingo;

import com.duolingo.entities.Word;

public class Main {
    public static void main(String[] args) {

        Word word = new Word("Banco","Sustantivo");

        word.addDefinition("Sitio para sentarse");
        word.addDefinition("Empresa que causó la crisis de 2007");



        System.out.println(word);


    }
}