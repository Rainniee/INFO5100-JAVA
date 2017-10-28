// score 7
/**
 * Q3
 * Given a non-empty integer array of size n
 * find the minimum number of moves required to make all array elements equal
 * where a move is incrementing n - 1 elements by 1
 * Example:
 * Input: [1,2,3]
 * Output: 3
 **/
 
package midtermpartb;

/**
 *
 * @author Apple
 */

public class minMoves {
    
    public int minMoves(int[] nums) {
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            sum += num; 
            min = Math.min(min, num);
        }
        return sum - (min*nums.length);
    }    
}
