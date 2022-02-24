package com.careerdevs;

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
}
