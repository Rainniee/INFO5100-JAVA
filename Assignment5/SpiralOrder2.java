/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spiralorder2;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author asus
 */
public class SpiralOrder2 {

    /**
     * @param args the command line arguments
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
