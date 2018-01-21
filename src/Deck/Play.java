package Deck;

import Deck.DealCards;
import Deck.DeckGenerator;

public class Play {

    public static void main(String[] args){

        int[] a = DeckGenerator.DeckGeneratorM();
        System.out.println("Show " + a.length);
        int[] Hand = DealCards.DealCardsM(a,3,1);
        for(int i = 0;i<Hand.length - 1;i++){
            System.out.println(Hand[i]);
        }
        System.out.println(" Next draw");
        int[] Hand2 = DealCards.DealCardsM(a,3,2);
        for(int i = 0;i<Hand2.length - 1;i++){
            System.out.println(Hand2[i]);
        }

    }
}
