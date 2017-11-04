/**The constructor’s parameter should establish the size of the card array. 
 * The getCurrentSize and getCard methods are trivial. 
 * The addCard method should increment currentSize after adding the input card to the end of the currently filled part of the cards array. 
 * The removeCard method should retrieve a reference to the card at index in the cards array, decrement the currentSize of the cards array and shift all array elements above index down by one place, and return the reference to the card originally at index. 
 * Use the display method to test this class.
 */

package heartsgame;

/**
 *
 * @author apple
 */
public class GroupOfCards {
    
    private Card[] cards;
    private int currentSize = 0;
    
    public GroupOfCards(int num){
        if(num>=0 && num<=52)
            System.out.println("Card array size must be between 0 and 52!");
        else
            cards = new Card[num];
    }
    
    public int getCurrentSize(){
        return currentSize;
    }
    
    public Card getCard(int i){
        return cards[i];
    }
    
    public void addCard(Card card){
        if (currentSize == cards.length) {
	    System.out.println("Cannot add card anymore!");
	    return;
	}
        else
            cards[currentSize++] = card;
    }
    
    public Card removeCard(int index){
        Card removed = cards[index];
        --currentSize;
        for(int j = index; j<currentSize; ++j){
            cards[j] = cards[j++];
        }
        cards[currentSize] = null;
        return removed;
    }
    
    public void display() {
        System.out.println("The current size: " + currentSize);
        for (Card card:cards){
            card.display();
        }
    }
    
}
