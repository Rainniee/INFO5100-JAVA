// score 4
/**
 * Q4
 * Given n dice each with m faces, numbered from 1 to m
 * find the number of ways to get sum X
 * X is the summation of values on each facewhen all the dice are thrown
 * Your function should take, number of faces, number of dice and required sum as input and return a number of possible ways
 **/

package midtermpartb;

/**
 *
 * @author Apple
 */

public class countNumberOfPossibleWays {
    /* for input 6,2,10
        expected output = 3
        your function breaks with StackOverflowError
    */
    
    public static int countNumberOfPossibleWays(int m, int n, int x) {
        if (n<1 && m<4) return 0;  
        if (n==1 && x<=m) return 1;  
        int value = 0;
        for (int i=1;i<=m;++i) {
            value+=countNumberOfPossibleWays(m,n-1,x-i);
        }
        return value;
    }
    
}
