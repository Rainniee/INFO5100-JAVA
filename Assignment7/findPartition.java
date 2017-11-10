/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assingnment7;

import java.util.ArrayList;
import java.util.HashSet;

public class findPartition {
    public static ArrayList<ArrayList<Integer>> ret;
    
    public static void main(String[] args){
	int[] test = new int[]{1,5,11,5};
	int sum = 0;
        ret = new ArrayList<ArrayList<Integer>>();
	for(int c: test){
            sum+=c;
        }
        if(sum%2==1) System.out.println("false");
        findPartition(test, 0, sum/2, new HashSet<Integer>(), 0);
		
	for(ArrayList<Integer> cur: ret){
            System.out.println("The array can be partitioned as " + cur);
	}
		
	ArrayList<Integer>[] tt = new ArrayList[1000];
        
    }
    
    public static void findPartition(int[] input, int start, int halfSum, HashSet<Integer> intSet, int curSum){
	if(curSum>halfSum){
            return;
        }
	if(curSum==halfSum){
            ArrayList<Integer> cur = new ArrayList<Integer>(intSet);
            ret.add(cur);
            return;
        }
        for(int i=start; i<input.length; i++){
            intSet.add(input[i]);
	    //System.out.println(i+" "+halfSum+" "+curSum+" "+input[i]);
            findPartition(input, i+1, halfSum, intSet, curSum+input[i]);
            intSet.remove(input[i]);
        }
    }
    
}
