/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class4;

public class Strawberry extends Fruit{
    
    public float getDiscount(){
        getCleaned();
        if(getExpiryTimeInDays() < 1){
            if(price > 2){
                return 0.25f;
            }
            else{
                return 0.10f;
            }
        }
        return 0;
    }
}
    
