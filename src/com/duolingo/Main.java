package com.duolingo;

import com.duolingo.entities.Dictionary;
import com.duolingo.entities.Word;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dictionary englishDictionary = new Dictionary();

        int option = -1;
        Scanner keyboard = new Scanner(System.in);



        while (option != 5) {

            String boxGraphic = "\n╔═════════════════════════════════════════╗";
            boxGraphic += "\n          \uD83E\uDD89 D U O L I N G O \uD83E\uDD89          ";
            boxGraphic += "\n╟─────────────────────────────────────────╢";
            boxGraphic += "\n  Seleccione una opción:                    ";
            boxGraphic += "\n║                                         ║";
            boxGraphic += "\n  1. Añadir palabra                        ";
            boxGraphic += "\n║ 2. Eliminar palabra                     ║";
            boxGraphic += "\n  3. Existe palabra                        ";
            boxGraphic += "\n║ 4. Mostrar iniciales disponibles        ║";
            boxGraphic += "\n  5. Ver palabras por inicial              ";
            boxGraphic += "\n║ 6. Cerrar                               ║";
            boxGraphic += "\n                                           ";
            boxGraphic += "\n╚═════════════════════════════════════════╝";

            System.out.println(boxGraphic);
            option = keyboard.nextInt();
            keyboard.nextLine();


            switch (option) {
                case 1:
                    String userLemma;
                    String userCategory;
                    String userDefinition;
                    boolean definitionStop = true;
                    boolean wrongAnswerStop = true;
                    String definitionAnswer;

                    System.out.println("Inserte la palabra que quiere introducir en el diccionario:");
                    userLemma = keyboard.nextLine().trim().toLowerCase();

                    System.out.println("Inserte el tipo de la palabra (sustantivo, adjetivo, etc.):");
                    userCategory = keyboard.nextLine();

                    Word newWord = new Word(userLemma,userCategory);

                    System.out.println("Inserte una definición: ");
                    userDefinition = keyboard.nextLine();
                    newWord.addDefinition(userDefinition);

                    /*while(definitionStop){


                        *//*while (wrongAnswerStop)
                            System.out.println("¿Quiere seguir añadiendo definiciones?");
                            definitionAnswer = keyboard.nextLine().replace("í","i").toLowerCase();
                            switch (definitionAnswer) {
                                case "si":
                                    wrongAnswerStop = false;
                                    break;
                                case "no":
                                    definitionStop = false;
                                    wrongAnswerStop = false;
                                default:
                                    System.out.println("Sí o no.");
                            }
                        }*/

                    englishDictionary.addToDictionary(newWord);
                    System.out.println("Palabra añadida.");
                    break;


                case 2:
                    System.out.println("¿Qué palabra quiere eliminar?");
                    userLemma = keyboard.nextLine();

                    englishDictionary.deleteWord(userLemma);
                    //TODO: esto explota
                    break;


                case 3:
                    System.out.println("¿Qué palabra quiere buscar?");
                    userLemma = keyboard.nextLine();

                    englishDictionary.wordExists(userLemma);
                    break;


                case 4:

                    System.out.println(englishDictionary.displayInitials());
                    break;

                case 5:
                    String userInitial;

                    System.out.println("Introduzca la inicial de las palabras que quiere mostrar:");
                    userInitial = keyboard.nextLine().toLowerCase();

                    System.out.println(englishDictionary.displayWords(userInitial));
                    break;
                    // TODO: por alguna razón con esto el programa se termina, también terminaba en el caso 5


                case 6:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida. Seleccione opción de 1 a 6.");
                    break;
            }
        }
        keyboard.close();
    }
}