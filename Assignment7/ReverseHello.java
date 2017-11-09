/** Write a program called ReverseHello.java that creates a thread (let's call it Thread 1). 
 *  Thread 1 creates another thread (Thread 2); Thread 2 creates Thread 3; and so on, up to Thread 50. Each thread should print Hello from Thread num!
 *  But you should structure your program such that the threads print their greetings in reverse order. 
 **/
package assignment7;

/**
 *
 * @author apple
 */

class ThreadList extends Thread {
    int num;
    public ThreadList(int num) {
	this.num = num;
    }
    public void run() {
	super.run();
	if (num == 50) {
            System.out.println("Hello from Thread " + num);
	    return;
        }
	ThreadList threadl = new ThreadList(num + 1);
		threadl.start();
		try {
                    threadl.join();
		} catch (InterruptedException e) {
                    e.printStackTrace();
		}
		System.out.println("Hello from Thread " + num);
	}
}

public class ReverseHello {
    public static void main(String[] args) throws InterruptedException {
	ThreadList threadl = new ThreadList(1);
	threadl.start();
    }
}


