package org.example;

import java.util.LinkedList;
import java.util.List;

public class Deck{
    List<Card> deck;
    int numberOfDecks;

    Deck(){
        this(1);
    }

    Deck(int numberOfDecks){
        setNumberOfDecks(numberOfDecks);
    }

    public int getNumberOfDecks(){
        return numberOfDecks;
    }

    void setNumberOfDecks(int numberOfDecks){
        this.numberOfDecks = numberOfDecks;
    }

    public boolean reset(){
        newDeck();
        shuffle();
        return true;
    }

    private void newDeck(){
        deck = new LinkedList<>();
        for(int i = 0; i < numberOfDecks; i++){
            for(Suit suit : Suit.values()){
                for(Value value : Value.values()){
                    deck.add(new Card(value, suit));
                }
            }
        }
    }

    private void shuffle(){
        List<Card> cards = new LinkedList<>();
        while(!deck.isEmpty()){
            int index = (int)(Math.random() * deck.size());
            cards.add(deck.remove(index));
        }
        deck.addAll(cards);
    }

    public Card deal(){
        return deck.remove(0);
    }

    public boolean isEmpty(){
        return deck.isEmpty();
    }

    public String toString(){
        return deck.toString();
    }
}
