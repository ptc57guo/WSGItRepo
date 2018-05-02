package com.shufflecards;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    private static final int DECK_SIZE = 52;

    public static void main(String args[]) {
        shuffleArray();
        shuffleCollection();
        
    }
    
    public static void shuffleArray() {
        ArrayList<Integer> deck = new ArrayList<Integer>();

        for (int i = 0; i < DECK_SIZE; ++i) {
            deck.add(i);
        }

        ArrayList<Integer> shuffledDeck = new ArrayList<Integer>();

        while (deck.size() > 0) {
            int index = (int) (Math.random() * deck.size());
            shuffledDeck.add(deck.remove(index));
        }

        System.out.println(shuffledDeck.toString());
    	
    }
    
    public static void shuffleCollection() {
    
        ArrayList<Integer> deck = new ArrayList<Integer>();

        for (int i = 0; i < DECK_SIZE; ++i) {
            deck.add(i);
        }

        Collections.shuffle(deck);

        System.out.println(deck);
       
    }
}
