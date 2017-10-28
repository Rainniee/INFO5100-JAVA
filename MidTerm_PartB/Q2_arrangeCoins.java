// score 4
/**
 * Q2
 * You have a total of n coins that you want to form in a staircase shape, where every k-th row must have exactly k coins
 * Given n, find the total number of full staircase rows that can be formed
 * n is a non-negative integer and fits within the range of a 32-bit signed integer.
 * Example 1:
 * n = 5
 * The coins can form the following rows:
 * ¤
 * ¤ ¤
 * ¤ ¤
 * Because the 3rd row is incomplete, we return 2.
 * Example 2:
 * n = 8
 * The coins can form the following rows:
 * ¤
 * ¤ ¤
 * ¤ ¤ ¤
 * ¤ ¤
 * Because the 4th row is incomplete, we return 3
 **/
 
package midtermpartb;

/**
 *
 * @author Apple
 */
/* for input = 5, expected output = 2, your output = 1
*/
public class arrangeCoins { 
    public int arrangeCoins(int n){
        int i =1;
        while(n > i){
            n = n - i;
            i++;         
        }
        return i - n;
    }    
}
