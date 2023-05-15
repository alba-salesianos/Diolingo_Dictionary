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

                    while(definitionStop){
                        userDefinition = "";
                        System.out.println("Inserte una definición: ");
                        userDefinition = keyboard.nextLine();
                        newWord.addDefinition(userDefinition);

                        while (wrongAnswerStop)
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
                        }

                    englishDictionary.addToDictionary(newWord);
                    break;


                case 2:
                    System.out.println("¿Qué palabra quiere eliminar?");
                    // TODO: hacer el método para eliminar con remove (el que no tire exepción)
                    break;


                case 3:
                    // TODO: hacer el método exists

                    break;


                case 4:
                    String userInitial;

                    System.out.println("Introduzca la inicial de las palabras que quiere mostrar:");
                    userInitial = keyboard.nextLine().toLowerCase();

                    englishDictionary.displayWords(userInitial);
                    break;


                case 5:
                    System.out.println(englishDictionary.displayInitials());
                    break;


                default:
                    System.out.println("Opción no válida. Seleccione opción de 1 a 5.");
                    break;
            }
        }
        keyboard.close();
    }
}