package com.careerdevs;

import java.util.Scanner;

public class wordHunt {

    public static void main(String[] args) {
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
}

