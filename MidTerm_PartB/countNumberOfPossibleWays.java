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
public class countNumberOfPossibleWays {
    
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




class Cell
     {
    	 int x,y;
    	 Cell(int x,int y)
    	 {
    		 this.x=x;
    		 this.y=y;
    	 }
    	 public String toString()
    	 {
    		 return "["+this.x+","+this.y+"]";
    	 }
}