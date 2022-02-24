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
            playGame(userChoice);
        }
    }

    private void printHeader() {
        System.out.println("*--------------------------------------*");
        System.out.println("|       Welcome to Word Hunt           |");
        System.out.println("*--------------------------------------*");
    }

    private void printMenu() {
        System.out.println("Guess the word by choosing a letter.");
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

    private void playGame(int selection) {
        switch (selection) {
            case 1:
                //playTheGame();
                break;
            case 2:
                exit = true;
                System.out.println("Don't go try again!");
                break;
            default:
                System.out.println("An error has occurred please restart the program.");
            }
         }
    }
