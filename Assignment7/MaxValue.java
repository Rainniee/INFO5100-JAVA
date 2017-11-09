/**
 * Write a program called MaxValue.java that finds the maximum value in an array of ints using 4 threads. 
 * Your main should be similar as the one in SumThread example, though you should construct your array of random numbers instead of increasing numbers. 
 * You may assume in your threaded code that the array has at least 4 elements.
 **/
package assignment7;

/**
 *
 * @author apple
 */

import java.util.Random;

class maxValueThread extends Thread {
    int num;
    int[] array;
    int maxValue;
    
    public maxValueThread(int num, int[] array) {
	this.num = num;
	this.array = array;
	this.maxValue = Integer.MIN_VALUE;
    }
    
    public void run() {
	super.run();
	for (int i = num; i < array.length; i = i + 4){
	    maxValue = Math.max(array[i], maxValue);
        }
    }
}

public class MaxValue {
    public static int findMaxValue(int[] array) throws InterruptedException {
	maxValueThread[] threads = new maxValueThread[4];
	for (int i = 0; i < 4; i++) {
	    threads[i] = new maxValueThread(i, array);
	    threads[i].start();
        }
	int max = Integer.MIN_VALUE;
	for (int i = 0; i < 4; i++) {
            threads[i].join();
	    max = Math.max(max, threads[i].maxValue);
	}
	return max;
    }
    
    public static void main(String[] args) throws InterruptedException {
        int[] array = new int[50];
	Random r = new Random();
	for (int i = 0; i < array.length; i++){
            array[i] = r.nextInt(100);
        }
        int maxValue = findMaxValue(array);
        System.out.println("The max value of array is: " + maxValue);
    }
    
}


