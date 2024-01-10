package org.example;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Blackjack blackjack = new Blackjack();

        Scanner scanner = new Scanner(System.in);

        System.out.println("choose: (0) end");
        System.out.println("        (1) deal");
        System.out.println("        (2) reset");
        System.out.println("        (3) print deck");
        int num = scanner.nextInt();

        while(num != 0){
            if(num == 1){
                System.out.println(blackjack.deckOfCards.deal());
            }else if(num == 2){
                blackjack.newGame();
            }else if(num == 3){
                blackjack.printCards();
            }
            num = scanner.nextInt();
        }
    }
}