package EfficientDeck;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class DeckGeneratorEfficient {

    //Fischer Yates scrambling of the deck
    public static int[] ScrambledDeck(){
        int[] ReturnDeck = new int[52];
        for(int i = 0;i < ReturnDeck.length;i++){
            ReturnDeck[i] = i + 1;
        }
        System.out.println(ReturnDeck[51]);

        Random rand = ThreadLocalRandom.current();

        for(int i = 51;i > 0;i--) {

            int ScramblN = rand.nextInt(i);

            int tempN = ReturnDeck[ScramblN];
            ReturnDeck[ScramblN] = ReturnDeck[i];
            ReturnDeck[i] = tempN;
        }

        return ReturnDeck;
    }
}
