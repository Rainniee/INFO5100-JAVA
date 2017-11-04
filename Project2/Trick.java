/**
 * The constructor’s parameter is the number of players
 * And the constructor calls the superclass’s constructor with one less than twice this number, to allow room in the first trick for undelt cards. 
 * The four get- methods are trivial. 
 * The isWinner method should return true unless the previous winning card is not null 
 * And the current card is not in the suit being played or its number is less than the winning card’s number. 
 * In the update method, if the current card is the winner, set winner equal to current player’s number and set the winning card equal to the current card. 
 * If the current card is a heart, set hearts to true. If the current card is the queen of spades, set queen to true.
 */

package heartsgame;

/**
 *
 * @author apple
 */
public class Trick extends GroupOfCards{
    
    private int winner;
    private Card winningCard;
    private boolean hearts = false;
    private boolean queen = false;
    
    public Trick(int players){
        super(2 * players - 1);
    }
    
    public int getWinner(){
        return winner;
    }
    
    public Card getWinningCard(){
        return winningCard;
    }
    
    public boolean getHearts(){
        return hearts;
    }
    
    public boolean getQueen(){
        return queen;
    }
    
    public void update(int playerNum, Card card){
        if (this.isWinner(card)) {
            winner = playerNum;
            winningCard = card;
            if(card.getSuit() == 2){
                hearts = true;
            }
            if(card.getSuit() == 3 && card.getNum() == 12){
                queen = true;
            }
        }
    }
    
    private boolean isWinner(Card card) {
        if (winningCard != null){
            if (card.getSuit() != winningCard.getSuit() || card.getNum() < winningCard.getNum()){
                return false;
            }
        }
        return true;
    }
    
}
