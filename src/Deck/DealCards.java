package Deck;

public class DealCards {
    public static int[] DealCardsM(int[] a, int nOfCards, int startCard){
        int b = startCard + nOfCards;
        if(b > a.length){
            System.out.println("Please start at a card lower than " + b);
        }
        int[] Hand = new int[nOfCards + 1];
        int x = 0;
        for(int p = startCard;p<b;p++){
            Hand[x] = a[p];
            x = x + 1;
        }
        return Hand;
    }

}
