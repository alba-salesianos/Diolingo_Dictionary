package com.duolingo;

import com.duolingo.entities.Dictionary;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dictionary englishDictionary = new Dictionary();

        int option = -1;
        Scanner keyboard = new Scanner(System.in);


        while (option != 6) {

            String boxGraphic = "\n╔═════════════════════════════════════════╗";
            boxGraphic += "\n          \uD83E\uDD89 D U O L I N G O \uD83E\uDD89          ";
            boxGraphic += "\n╟─────────────────────────────────────────╢";
            boxGraphic += "\n  Choose an option:                        ";
            boxGraphic += "\n║                                         ║";
            boxGraphic += "\n  1. Add word                              ";
            boxGraphic += "\n║ 2. Delete word                          ║";
            boxGraphic += "\n  3. Check if word exists                   ";
            boxGraphic += "\n║ 4. Show existing initials               ║";
            boxGraphic += "\n  5. Show words by initials                ";
            boxGraphic += "\n║ 6. Close                                ║";
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

                    System.out.println("Please enter the word you would like to add to the dictionary:");
                    userLemma = keyboard.nextLine().trim().toLowerCase();

                    System.out.println("Enter the category of the word (noun, adjective, verb...):");
                    userCategory = keyboard.nextLine().toLowerCase();

                    System.out.println("Enter a definition: ");
                    userDefinition = keyboard.nextLine().toLowerCase();


                    englishDictionary.addToDictionary(userLemma, userCategory, userDefinition);
                    System.out.println("Word added successfully.");
                    break;


                case 2:
                    System.out.println("Which word would you like to delete?");
                    userLemma = keyboard.nextLine();

                    System.out.println(englishDictionary.deleteWord(userLemma));
                    break;


                case 3:
                    System.out.println("Which word would you like to search?");
                    userLemma = keyboard.nextLine();

                    System.out.println(englishDictionary.wordExists(userLemma));
                    break;


                case 4:
                    System.out.println(englishDictionary.displayInitials());
                    break;

                case 5:
                    String userInitial;

                    System.out.println(englishDictionary.displayInitials());
                    System.out.println("Please enter the initial of the words you would like to display:");
                    userInitial = keyboard.nextLine().toLowerCase();

                    System.out.println(englishDictionary.displayWords(userInitial));
                    break;


                case 6:
                    System.out.println("Closing the program...");
                    break;

                default:
                    System.out.println("Wrong option. Please select option 1 to 6.");
                    break;
            }
        }
        keyboard.close();
    }
}