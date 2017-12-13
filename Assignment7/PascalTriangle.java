/** Pascal’s triangle is a triangular array of the binomial coefficients. 
 *  Write a function that takes an integer value n as input and prints first n lines of the Pascal’s triangle. 
 *  Following are the first 6 rows of Pascal’s Triangle.
 *  1
 *  1 1
 *  1 2 1
 *  1 3 3 1
 *  1 4 6 4 1
 *  1 5 10 10 5 1
 */
package assignment7;

/**
 *
 * @author apple
 */

public class PascalTriangle {
    
    public static void printPascalTriangle(int n) { // use long, for input 100, int overflows; Score 1.5
	int[][] nums = new int[n][n];
	for (int i = 0; i < n; i++){
            for (int j = 0; j <= i; j++){
                if (j == 0 || j == i)
                    nums[i][j] = 1;
                else
                    nums[i][j] = nums[i - 1][j - 1] + nums[i - 1][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++)
                System.out.print(nums[i][j] + " ");
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
	printPascalTriangle(10);
    }
}
