/**
 * The Deck class’s constructor is already provided in the text. 
 * To shuffle the deck, use a for loop that starts with unshuffled = getCurrentSize and steps down to one. 
 * In each iteration, use Math.random to pick an index in the unshuffled range, remove the card at that index, and then add it to the high end of the array. 
 * To deal a card, just remove the card at index = 0.
 */

package heartsgame;

/**
 *
 * @author apple
 */
public class Deck extends GroupOfCards{
    
    public static int TOTAL_CARDS=52;
    
    public void shuffle(){
        int unshuffled = super.getCurrentSize();
        for (int i = unshuffled; i>0; i--){
            int sh = (int) Math.rint(Math.random() * (i-1));
            super.addCard(super.removeCard(sh));
        }
    }
    
    public Deck(){
        super(52);
        for(int i=0; i<4; i++){
            for(int j=2; j<15; j++){
                super.addCard(new Card(i,j));
            }
        }
    }
    
    public Card dealCard() {
        return super.removeCard(0);
    }
    
}

    
    
    
    

    
    
}
