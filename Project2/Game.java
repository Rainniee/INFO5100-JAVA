/**
 * The Game class is long but straightforward. 
 * Since the number of players should remain constant after a game has been instantiated, make PLAYERS a final instance variable
 * and initialize it in the Game constructor with a value equal to the constructor’s parameter value. 
 * This constructor should instantiate a Hand array with constructor parameter equal to the number of players. 
 * It should instantiate individual Hand objects for each player, with player identification number and maximum number of cards in a player’s hand as constructor arguments. 
 * It should also instantiate a Trick array with total number of tricks as the constructor argument, but it should not populate this array with any individual tricks.
 */
package heartsgame;

/**
 *
 * @author apple
 */

public class Game {
   
    public final int PLAYERS;
    private Deck deck;
    private Hand[] hands;
    private Trick[] tricks;
    private int numberOfTricks = 0;
    private boolean hearts = false;
    private boolean queenOfSpades = false;
    
        
    public Game(int numOfPlayers) {
        super();
        if (numOfPlayers < 3 || numOfPlayers > 6)
            System.out.println("Number of players must be between 3 and 6");
        else{
            PLAYERS = numOfPlayers;
	    hands = new Hand[numOfPlayers];
	    for (int i = 0; i < hands.length; i++)
		hands[i] = new Hand(i, 52 / PLAYERS);
	    tricks = new Trick[52 / PLAYERS];
	    numberOfTricks = 0;
        }
    }
    
    public int getNumberOfTricks() {
        return numberOfTricks;
    }
    
    public boolean getHearts() {
        return hearts;
    }
    
    public boolean getQueenOfSpades() {
        return queenOfSpades;
    }
    
    public void playAGame() {
	deck = new Deck();
	int cardsLeft = 52 % PLAYERS;
	if (cardsLeft == 1)
	    deck.removeCard(0);
	if (cardsLeft == 2) {
	    deck.removeCard(0);
	    deck.removeCard(0);
        }
	deck.shuffle();
	for (int i = 0; i < tricks.length; i++)
	    for (int j = 0; j < PLAYERS; j++)
		hands[j].addCard(deck.dealCard());
		int playerNum = 0;
		int temp = 15;
		for (int i = 0; i < PLAYERS; i++) {
		    hands[i].setShortest();
                    hands[i].sort();
		    System.out.println("player " + i + " shortest = " + hands[i].getShortest());
		    hands[i].display();
		    if (hands[i].getCard(tricks.length - 1).getSuit() == 0 && hands[i].getCard(tricks.length - 1).getNum() < temp) {
			temp = hands[i].getCard(tricks.length - 1).getNum();
			playerNum = i;
                    }
		    System.out.println();
                }
                for (int i = 0; i < tricks.length; i++) {
		    tricks[i] = new Trick(PLAYERS);
		    numberOfTricks++;
		    Card card;
		    if (i == 0) {
			int index = hands[playerNum].getCurrentSize() - 1;
			card = hands[playerNum].removeCard(index);
			tricks[i].update(playerNum, card);
                    }
                    else{
                        card = hands[playerNum].palyACard(this, tricks[i]);
                    }
                    System.out.print("player " + playerNum + "      ");
		    card.display();
		    for (int j = 1; j < PLAYERS; j++) {
			playerNum = (playerNum + 1) % PLAYERS;
			card = hands[playerNum].palyACard(this, tricks[i]);
			System.out.print("player " + playerNum + "      ");
			card.display();
                    }
		    playerNum = tricks[i].getWinner();
		    if (i == 0) {
			if (cardsLeft == 1)
			    System.out.println("undelt card   card: clubs 2");
			if (cardsLeft == 2) {
			    System.out.println("undelt card   card: clubs 2");
			    System.out.println("undelt card   card: diamonds 2");
                        }
                    }
                    System.out.println();
		}
		for (int i = 0; i < PLAYERS; i++)
		    System.out.println("players " + i + "  score = " + computePoints(i));
    }
    
    public void updateHeartsAndQueen(Card card) {
	if (card.getSuit() == 2 && hearts == false) {
	    System.out.println("Hearts is now broken");
	    hearts = true;
        }
        if (card.getSuit() == 3 && card.getNum() == 12)
            queenOfSpades = true;
    }
    
    private int computePoints(int playerNum) {
	int point = 0;
	for (int i = 0; i < numberOfTricks; i++) {
	    if (tricks[i].getWinner() == playerNum)
	    for (int j = 0; j < PLAYERS; j++) {
		if (tricks[i].getCard(j).getSuit() == 2)
		    point++;
		if (tricks[i].getCard(j).getSuit() == 3 && tricks[i].getCard(j).getNum() == 12)
		    point += 13;
            }
        }
        return point;
    }
    
}
