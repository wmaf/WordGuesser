package com.careerdevs;

import java.util.Scanner;

public class wordHuntMenu {
    boolean exit;


    //Testing via public void
    public static void main(String[] args) {
        wordHuntMenu menu = new wordHuntMenu();
//        menu.printHeader();
//        menu.printMenu();
        //End testing
        menu.runMenu();
    }

    public void runMenu() {
        printHeader();
        while (!exit) {
            printMenu();
            int userChoice = getUserInput();
            playGame(1);
            playGame(2);
        }
    }

    private void printHeader() {
        System.out.println("*-----------------****************--------------------*");
        System.out.println("|               Welcome to Word Hunt!                 |");
        System.out.println("|       You guess the word by choosing letters.       |");
        System.out.println("*-----------------****************--------------------*");
    }

    private void printMenu() {
        //System.out.println("Guess the word by choosing a letter.");
        System.out.println("Please make a selection:");
        System.out.println("#(1) To play");
        System.out.println("#(2) To Quit");
    }

    private int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        int userSelection = -1;
        while (userSelection < 0 || userSelection >= 2) {// use you variable here
            try {
                System.out.println("\nPlease make a selection:");
                userSelection = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Something went wrong here, please try again");
            }
        }
        return userSelection;
    }

    private void playGame(int userSelection) {
        switch (userSelection) {
            case 1:
                playTheGame();
                break;
            case 2:
                exitTheGame();
                //exit = true;
                //System.out.println("Don't go try again!");
                break;
            default:
                System.out.println("An error has occurred please restart the program.");
        }
    }

    private void playTheGame() {
        //-----------------dump the game here------------------------//
        //System.out.println("Test output");
        int tries = 0;

        boolean iterated = false;
        String temp = "";
        String holder = "";

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to hidden word:");

        String hiddenWord = "pneumonoultramicroscopicsilicovolcanoconiosis";

        do {
            System.out.println("You have" +" "+ (10 - tries)+ " " + "tries remaining");
            System.out.println("please enter letter number:" + (tries + 1));
            String yourLetter = keyboard.nextLine();
            for(int i = 0; i < hiddenWord.length(); i ++) {
                if (yourLetter.equals(Character.toString(hiddenWord.charAt(i)))) {
                    if(!iterated)
                        temp += Character.toString(hiddenWord.charAt(i));
                    else {
                        holder = Character.toString(temp.charAt(i)).replace("-", yourLetter);
                        temp = temp.substring(0, i) + holder + temp.substring( i + 1, temp.length());
                    }
                } else {
                    if(!iterated) {
                        temp += "-";
                    }
                }
            }
            tries++;
            iterated = true;
            if(temp.equals(hiddenWord)) {
                System.out.println("Correct!!! " + hiddenWord +" "+hiddenWord +" "+hiddenWord +" "+hiddenWord);
                break;
            }
        }while (tries < 10);
    }
        //System.exit(0);

    private void exitTheGame() {
        System.out.println("Exit");
        exit = true;
        System.exit(0);
    }
}