package com.company;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    int theNumber;
    int max;

    Scanner scanner = new Scanner(System.in);

    public GuessTheNumber(){
        Random random = new Random();
        max = 100;
        theNumber = Math.abs(random.nextInt()) % (max + 1);
    }

    public void play(){
        while (true) {
            int move = scanner.nextInt();
            if (move > theNumber) {
                System.out.println("Your number is too big. Try Again");
            } else if (move < theNumber) {
                System.out.println("Your number is too small. Try Again");
            } else {
                System.out.println("YOU GOT IT BRO");
                break;
            }
        }
    }


    public static  void howBigIsMyNumber(int x) {
        if (x >= 0 && x <= 10) {
            System.out.println("Our Number is pretty small");
        } else if (x >= 11 && x <= 100) {
            System.out.println("Our number is pretty big");
        } else {
            System.out.println("Our number is out of range");
        }
    }
}
