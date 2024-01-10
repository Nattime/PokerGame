package org.example;

public class Card{
    private Value value;
    private Suit suit;
    Card(Value value, Suit suit){
        setValue(value);
        setSuit(suit);
    }

    public String toString(){
        return value + " " + suit;
    }

    void setValue(Value value){
        this.value = value;
    }

    void setSuit(Suit suit){
        this.suit = suit;
    }

    public Suit getSuit(){
        return suit;
    }
    public Value getValue(){
        return value;
    }
}
