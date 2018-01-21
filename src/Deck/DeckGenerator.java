package Deck;

import java.util.Random;



public class DeckGenerator{


    public static int[] DeckGeneratorM(){
        int nOfDecks = 1;
        int nOfCards = nOfDecks*52;
        Random rand = new Random();
        int[] FinalDeck = new int[nOfCards];
        boolean[] Deck = new boolean[nOfCards];
        for (int i = 0;i<nOfCards;i++){
            int p = rand.nextInt(51);
            if(Deck[p] != true){
                FinalDeck[i] = p + 1;
                Deck[p] = true;
            }
            else if(Deck[p] == true && i < (nOfCards - 1)){
                i = i - 1;
            }
            else{
                break;
            }
        }
        for(int i = 0;i<52;i++){
            if(Deck[i] == false){
                FinalDeck[51] = i;
            }
        }
        return FinalDeck;
    }


}
