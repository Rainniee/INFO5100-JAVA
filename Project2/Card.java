/**
 * Represent numbers and face-card values by integers ranging from 2 to 14, with 14 being the ace. 
 * Represent suits by integers as follows: 0 = clubs; 1 = diamonds; 2 = hearts; 3 = spades. 
 * Write a nice display method that uses switch statements to convert suit integers to the words, “clubs,” “diamonds,” and so on.
 * And the numbers 11…14 to the words “Jack,” “Queen,” and so on. 
 * Use the display method to test this class.
 */
package heartsgame;

/**
 *
 * @author apple
 */

public class Card {
    
    private int num;
    private int suit;
    
    public Card(int num, int suit){
        this.num = num;
        this.suit = suit;
    }
    
    public int getNum(){
        return num;
    }
    
    public int getSuit(){
        return suit;
    }
    
    public void display(){
        String str = new String();
        
        switch(num){
            case 14:
                str += "Ace ";
                break;
            case 2:
                str += 2 + " ";
		break;
            case 3:
                str += 3 + " ";
		break;
            case 4:
                str += 4 + " ";
		break;
            case 5:
                str += 5 + " ";
		break;
            case 6:
                str += 6 + " ";
		break;
            case 7:
                str += 7 + " ";
		break;
            case 8:
                str += 8 + " ";
		break;
            case 9:
                str += 9 + " ";
		break;
            case 10:
                str += 10 + " ";
		break;
            case 11:
                str += "Jack ";
		break;
            case 12:
                str += "Queen ";
		break;
            case 13:
                str += "King ";
		break;          
            default:
                System.out.println("Number must between 2 to 14!");
        }
        switch(suit){
            case 0:
                str += "clubs ";
		break;
            case 1:
                str += "diamonds ";
		break;
            case 2:
                str += "hearts ";
		break;
            case 3:
                str += "spades ";
		break;
	    default:
                System.out.println("Suit must between 0 to 3!");
		break;
        }
        System.out.println(str);
    }
}


