/**
 *  There are also two sensors
 *  one for heat and one for pressure
 *  which can be used to monitor the device.
 **/

package assingnment7;

/**
 *
 * @author apple
 */

public class Sensor extends Thread {
    private final Device device;
    private double value;
    public Sensor(Device device) {
	this.device = device;
    }
    public double getValue() {
	return value;
    }
    public void updateValue() {
	this.value += 0.001; /// check with other values here and see how it works
    }
    
    public void run() {
	while (true) {
            synchronized (device) {
		this.updateValue();
		device.notify();
            }
        }
    }
    
}