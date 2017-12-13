/** Write a program called ReverseHello.java that creates a thread (let's call it Thread 1). 
 *  Thread 1 creates another thread (Thread 2); Thread 2 creates Thread 3; and so on, up to Thread 50. Each thread should print Hello from Thread num!
 *  But you should structure your program such that the threads print their greetings in reverse order. 
 **/
package assignment7;

/**
 *
 * @author apple
 */
public class ReverseHello extends Thread { // score 2
    static final int MAX_THREADS = 50; // Maximum number of threads
    static final int FIRST_THREAD = 1; // First thread index
    private int counter; //Thread counter
	
    public ReverseHello(int counter) {
    	this.counter = counter;
    }
    
    public static void main(String[] args) throws InterruptedException {	
    	ReverseHello firstThread = new ReverseHello(FIRST_THREAD);
	firstThread.start();
    }
    
    @Override
    public void run() {	   	
    	try{
            if(counter <= MAX_THREADS){
    		startNewThread(counter++);
            }
    	}catch(Exception ex){
            System.out.println(ex.toString());
        }
    }
    
    private void startNewThread(int pCounter) throws InterruptedException{
    	ReverseHello reverseHelloThread = new ReverseHello(counter);
	reverseHelloThread.start();
	reverseHelloThread.join();
	System.out.println("Hello from Thread " + counter);
    }
    
}

