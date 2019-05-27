package com.company;

public class Main {

    public static void main(String[] args) {
        GuessTheNumber guessGame = new GuessTheNumber();
        System.out.println("Welcome to THE GAME: Try and guess the impossible number between 0 and 100");
        System.out.print("Type a number to begin: ");
        guessGame.play();
    }
}
