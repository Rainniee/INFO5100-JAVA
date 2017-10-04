/* Question 1
 * Now you are given a string S, which represents a software license key which we would like to format. 
 * The string S is composed of alphanumerical characters and dashes. 
 * The dashes split the alphanumerical characters within the string into groups. (i.e. if there are M dashes, the string is split into M+1 groups). 
 * The dashes in the given string are possibly misplaced.
 * We want each group of characters to be of length K (except for possibly the first group, which could be shorter, but still must contain at least one character). 
 * To satisfy this requirement, we will reinsert dashes. Additionally, all the lower case letters in the string must be converted to upper case.
 * So, you are given a non-empty string S, representing a license key to format, and an integer K. And you need to return the license key formatted according to the description above.
 */

/** My thought:
 * 1.Because of the dashes, we cannot find out the correct length of the initial String S.So I firstly remove the dashes and converted letters to upper case.
 * 2.After getting the newLength,I create an array and make it format.
 */

package Assignments4;
import java.util.Scanner;

/**
 *
 * @author apple
 */
public class Assignments4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a string S: ");
        String s = in.next();
        System.out.println("Please enter a positive number K: ");
	int k = in.nextInt();
        licenseKeyFormatting(s,k);
// TODO code application logic here
    }
    
    public static String licenseKeyFormatting(String S, int K) {
        int len = 0;
        int n = 'a' - 'A';
        char[] tempArray = S.toCharArray(); //converts String S to a new character String.
        for (int i = 0; i < tempArray.length; i++) {
            char ch = tempArray[i];
            if (ch == '-') {
                continue;
            }
            else if (ch >= 'a' && ch <= 'z') {
                tempArray[i] -= n;
            }
            tempArray[len] = tempArray[i];
            len++;
        }
        int newLength;
        if (len % K == 0){
            newLength = len + len / K - 1;
        }
        else {
            newLength = len + len / K;
        }
        char[] newArray = new char[newLength];
        int m = len;
        for (int i = newLength - 1; i >= 0; i--) {
            if (i != newLength - 1 && (newLength-i) % (K+1) == 0) {
                newArray[i] = '-';
            } 
            else {
                m--;
                newArray[i] = tempArray[m];
            }
        }
        System.out.println(newArray);
        return String.valueOf(newArray);
      
    }
}


/* Question 2
 * Implement a class called Tool. It should have an int field called strength and a char field called type.You may make them either private or protected. 
 * The Tool class should also contain the function void setStrength(int), which sets the strength for the Tool.
 * Create 3 more classes called Rock, Paper, and Scissors, which inherit fromc Tool. 
 * Each of these classes will need a constructor which will take in an int that is used to initialise the strength field. 
 * The constructor should also initialise the type field using 'r' for Rock, 'p' for Paper, and 's' for Scissors.
 * These classes will also need a public function bool fight(Tool) that compares their strengths in the following way:
 * Rock's strength is doubled (temporarily) when fighting scissors, but halved (temporarily) when fighting paper. 
 * In the same way, paper has the advantage against rock, and scissors against paper. 
 * The strength field shouldn't change in the function, which returns true if the original class wins in strength and false otherwise. 
 * You may also include any extra auxiliary functions and/or fields in any of these classes. 
 * Run the program without changing the main function, and verify that the results are correct. (Score 2)
 */

/**
 *
 * @author apple
 */

class Tool{
    protected int strength;
    protected char type;
        
    public Tool(){
        
    }
   
    public Tool(int n){
        this.strength = n;
    }
    public Tool(int n, char c){
        this.strength = n;
        this.type = c;
    }
        
    public void setStrength(int n){
        this.strength = n;
    }
    public int getStrength(){
        return this.strength;
    }
    public void setType(char c){
        this.type = c;
    }
    public char getType(){
        return this.type;
    }
}

class Scissors extends Tool {
        public Scissors(){
            this.type = 's';
        }
        public Scissors(int n){
            this.strength = n;
            this.type = 's';
        }
        public boolean fight(Tool tool){
            if(tool.type == 'r'){
                return this.strength > tool.strength * 2;
            }
            else if(tool.type == 'p'){
                return this.strength * 2 > tool.strength;
            }
            else
                return this.strength > tool.strength;
        }
    }
}

class Paper extends Tool {
        public Paper(){
            this.type = 'p';
        }
        public Paper(int n){
            this.strength = n;
            this.type = 'p';
        }
        public boolean fight (Tool tool){
            if(tool.type == 'r'){
                return this.strength * 2 > tool.strength;
            }
            else if(tool.type == 's'){
                return this.strength > tool.strength * 2;
            }
            else
                return this.strength > tool.strength;
        }
    }
}

class Rock extends Tool{
        public Rock(){
            this.type = 'r';
        }
        public Rock(int n){
            this.strength = n;
            this.type = 'r';
        }
        public boolean fight (Tool tool){
            if(tool.type == 'p'){
                return this.strength > tool.strength * 2;
            }
            else if(tool.type == 's'){
                return this.strength * 2 > tool.strength;
            }
            else
                return this.strength > tool.strength;
        }
    }
}



