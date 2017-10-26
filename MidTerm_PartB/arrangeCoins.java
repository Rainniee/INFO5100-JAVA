/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermpartb;

/**
 *
 * @author Administrator
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
