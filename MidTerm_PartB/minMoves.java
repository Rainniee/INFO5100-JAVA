/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermpartb;

import java.util.Arrays;

/**
 *
 * @author Administrator
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
