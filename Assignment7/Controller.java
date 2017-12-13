/** Write a class Controller (extends Thread) that can poll the sensors concurrently to running the device. 
 *  You should implement its run() method such that it starts the device and then monitors it by waiting for and examining any new sensor values. 
 *  The controller shuts down the device if the heat sensor exceeds the value 70 or the pressure sensor the value 100. 
 *  Also complete the run() method in the class Sensor which calls updateValue() continuously and signals the controller if its value has changed. 
 *  You can print the heat and pressure value to console in the run() method of Controller to check.
 **/
package assingnment7;

/**
 *
 * @author apple
 */

public class Controller extends Thread { // score 2
    private Device device;
    private Sensor heat;
    private Sensor pressure;
    
    public Controller(Device device, Sensor heat, Sensor pressure) {
	this.device = device;
	this.heat = heat;
	this.pressure = pressure;
    }

    public void run() {
	device.startup();
	synchronized (device) {		
            while (true) {
		try {
                    device.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
		System.out.println("heat -> " + heat.getValue() + ", pressure -> " + pressure.getValue());
		if (heat.getValue() > 70 || pressure.getValue() > 100) {
                    device.shutdown();
                    break;
                }
            }
        }
    }
    
}
