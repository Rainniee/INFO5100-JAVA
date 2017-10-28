// score 6
/**
 * Q1
 * Write a method named reverseEvenIndices that takes an integer array asinput and outputs an array 
 * such that all the values with odd indices remain in the same position
 * However, elements with even indices should be output in reverse order
 * That is, the first element with even index should be swapped with the last element with even index
 * the second een-indexed element with the second-to-last even-indexed element, and so on
 **/

package midtermpartb;

/**
 *
 * @author Apple
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
