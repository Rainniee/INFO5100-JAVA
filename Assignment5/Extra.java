/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spiralorder;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author apple
 */

public class SpiralOrder { // extra credit 1

    /* for input = {{1,2,3},
                    {5,6,7},
                    {9,10,11},
                    {13,14,15}};
        expected output = 1, 2, 3, 7, 11, 15, 14, 13, 9, 5, 6, 10
        your output = 13, 14, 15, 7, 11, 15, 14, 13, 9, 5
     */
    public List<Integer> spiralOrder(int[][] matrix) {  
        List<Integer> a = new LinkedList<>();  
        int rb = 0;
        int re = matrix.length - 1;
        int cb = 0;
        int ce = matrix[0].length - 1;  
        if(rb <= re && cb <= ce) {  
            for(int i = cb; i <= ce; i++) 
                a.add(matrix[re][i]);  
            rb++;  
            for(int i = rb; i <= re; i++) 
                a.add(matrix[i][ce]);  
            ce--;  
            if(rb <= re) {  
                for(int i = ce; i >= cb; i--) 
                    a.add(matrix[re][i]);  
            }  
            re--;  
            if(cb <=ce) {  
                for(int i = re; i >= rb; i--)
                    a.add(matrix[i][cb]);  
            }  
            cb++;  
        }  
        return a;  
    }  
    
}
