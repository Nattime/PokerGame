package org.example;

public class Blackjack{
    Deck deckOfCards;

    Blackjack(){
        deckOfCards = new Deck();
        newGame();
    }

    public boolean newGame(){
        return deckOfCards.reset();
    }

    // for debugging purpose
    public void printCards(){
//        while(!deckOfCards.isEmpty()){
//            System.out.println(deckOfCards.deal());
//        }
//        System.out.println(deckOfCards);
        int i = 0;
        for(Card iter : deckOfCards.deck){
            if(i % 4 == 0){
                System.out.println();
            }
            System.out.print(iter + "\t\t");
            i++;
        }
        System.out.println();
    }
}
