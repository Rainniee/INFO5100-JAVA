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
public class reverseEvenIndices {
    public static int[] reverseEvenIndices(int[] nums) {
        int n = nums.length;
        int[] output = new int[n];
        int first = 0;
        int last = n - 1;
        
        if(nums.length != 0){
            if(last % 2 == 1){
                output[last] = nums[last];
                last--;
            }
            while(first <= last){
                if(first % 2 == 0){
                    output[first] = nums[last];
                    output[last] = nums[first];
                }
                else{
                    output[first] = nums[first];
                    output[last] = nums[last];
                }
                first++;
                last--;
            }
            return output;            
        }
        else
            return null;
    }
    
}
