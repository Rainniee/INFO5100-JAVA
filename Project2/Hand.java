/**
 * The Hand class is the most difficult one to write, because it includes many of the rules and the strategy for playing the game. 
 * Since each player’s identification should remain constant after that player has been instantiated, make NUM a final instance variable
 * and initialize it in the Hand constructor with a value equal to the constructor’s first parameter value. 
 * The second parameter is the maximum number of cards the player will receive. 
 * Use it for the base-constructor call argument.
 */

package heartsgame;

/**
 *
 * @author apple
 */

public class Hand extends GroupOfCards{

    public final int NUM;
    private int shortest=0;
    
    public Hand(int playerNum, int numOfCards) {
        super(numOfCards);
        NUM = playerNum;
    }
    
    public void sort() {
        for (int unsorted = this.getCurrentSize(); unsorted > 0; unsorted--) {
            int maxIndex = unsorted - 1;
	    for (int i = 0; i < unsorted; i++) {
		int currentValue = this.getCard(i).getSuit() * 13 + this.getCard(i).getNum();
		int maxValue = this.getCard(maxIndex).getSuit() * 13 + this.getCard(maxIndex).getNum();
		if (currentValue > maxValue)
                    maxIndex = i;
            }
            Card card = this.removeCard(maxIndex);
            this.addCard(card);
        }
    }
    
    public void setShortest() {
        shortest = 0;
	if (this.findCount(1) <= this.findCount(0))
            shortest = 1;
	if (this.find(12, 3) == -1 && this.find(13, 3) == -1 && this.find(14, 3) == -1) {
            if (this.findCount(3) <= Math.min(this.findCount(0), this.findCount(1)))
		shortest = 3;
        }
    }
    
    public int getShortest() {
        return shortest;
    }
    
    public Card palyACard(Game game, Trick trick) {
	int index = 0;
	if ((trick.getCurrentSize() == 0) && (this.findCount(shortest) != 0) && (index = this.findHighest(shortest)) >= 0)
            index=findHighest(shortest)==-1? findLowest(g):findHighest(shortest); 
	else if ((trick.getCurrentSize() == 0) && (this.findCount(shortest) == 0) && (index = this.findLowest(game)) >= 0);
	else if ((trick.getCurrentSize() == game.PLAYERS - 1) && !trick.getHearts() && !trick.getQueen() && (index = findLastHigh(trick.getWinningCard().getSuit())) >= 0);
	else if ((index = findHighestBelow(trick.getWinningCard())) >= 0);
	else if ((index = findMiddleHigh(game, trick.getWinningCard().getSuit())) >= 0);
	else if ((index = find(12, 3)) >= 0); // queen of Spades
	else if ((index = find(14, 3)) >= 0); // Ace of Spades
	else if ((index = find(13, 3)) >= 0); // King of Spades
	else if ((index = findHighest(2)) >= 0); // heart
	else {
            index = findHighest();
        }
        Card card = this.removeCard(index);
	trick.update(NUM, card);
	game.updateHeartsAndQueen(card);
	return card;
    }
    
    public int findLowest(int suit) {
	int lowest = -1;
	int lowestNum = 15;
	for (int i = 0; i < getCurrentSize(); i++){
            if (getCard(i).getSuit() == suit)
		if (getCard(i).getNum() <= lowestNum) {
		    lowest = i;
		    lowestNum = this.getCard(i).getNum();
                }
        }
        return lowest;
    }
    
    private int findCount(int suit) {
	int count = 0;
	for (int i = 0; i < this.getCurrentSize(); i++){
            if (this.getCard(i).getSuit() == suit)
		count++;
        }
        return count;
    }
    
    private int find(int num, int suit) {
	for (int i = 0; i < this.getCurrentSize(); i++) {
            if (this.getCard(i).getNum() == num && this.getCard(i).getSuit() == suit)
		return i;
        }
	return -1;
    }
    
    private int findHighest(int suit) {
	int highest = -1;
	int highestNum = 1;
	for (int i = 0; i < getCurrentSize(); i++){
            if (getCard(i).getSuit() == suit)
		if (getCard(i).getNum() > highestNum) {
		    highest = i;
		    highestNum = getCard(i).getNum();
                }
        }
        return highest;
    }
    
    private int findLowest(Game game) {
	int lowest = -1;
	int lowestNum = 15;
	if (game.getHearts() == false && findCount(2) == getCurrentSize())
	    return lowest;
	if (game.getHearts() == true) {
	    for (int i = 0; i < getCurrentSize(); i++)
		if (getCard(i).getNum() < lowestNum) {
		    lowestNum = getCard(i).getNum();
		    lowest = i;
                }
        }
        else{
            for (int i = 0; i < getCurrentSize(); i++){
                if (getCard(i).getNum() < lowestNum && getCard(i).getSuit() != 2) {
                    lowestNum = getCard(i).getNum();
		    lowest = i;
                }
            }
        }
        return lowest; 
    }
    
    private int findLastHigh(int suit) {
	if (suit != 3)
	    return findHighest(suit);
	else {
	    int highest = -1;
	    int highestNum = 1;
	    for (int i = 0; i < this.getCurrentSize(); i++){
		if (getCard(i).getSuit() == suit)
		    if (getCard(i).getNum() > highestNum && getCard(i).getNum() < 12) {
			highest = i;
			highestNum = getCard(i).getNum();
                    }
            }
            return highest;
        }
    }
    
    private int findHighestBelow(Card winningCard) {
	for (int i = 0; i < getCurrentSize(); i++){
            if (getCard(i).getSuit() == winningCard.getSuit())
		if (getCard(i).getNum() < winningCard.getNum()) {
		    if (i != getCurrentSize() - 1) {
			if (getCard(i + 1).getSuit() != winningCard.getSuit())
			    break;
                    }
                }
            return i;
        }
        return -1;
    }
    
    private int findMiddleHigh(Game game, int suit) {
	if (suit == 3 && game.getQueenOfSpades() == false)
	    for (int i = 0; i < getCurrentSize(); i++){
		if (getCard(i).getNum() <= 11)
		    return i;		
            }
        return findHighest(suit);
    }
    
    private int findHighest() {
	int index = 0;
	int max = 1;
	for (int i = 0; i < getCurrentSize(); i++) {
	    if (getCard(i).getNum() > max) {
		max = getCard(i).getNum();
		index = i;
            }
	}
	return index;
    }  
    
}
